public class Demo26 {
    public ListNode deleteDuplication(ListNode pHead) {
        if(pHead==null) return null;
        ListNode head=new ListNode(-1);
        head.next=pHead;
        ListNode pre=head;
        ListNode cur=pre.next;
        while(cur!=null){
            if(cur.next!=null &&  cur.val==cur.next.val){
                while(cur.next!=null &&  cur.val==cur.next.val){
                    cur=cur.next;
                }
                cur=cur.next;
                pre.next=cur;
            }else{
                pre=cur;
                cur=cur.next;
            }
        }
        return head.next;

    }
}
