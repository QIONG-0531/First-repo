public class Demo23 {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
        ListNode pre=head;
        ListNode cur=pre.next;
        while(cur!=null){
            if(cur.val==val){
                pre.next=cur.next;
            }else{
                pre=cur;
            }
            cur=cur.next;
        }
        if(head.val==val){
            head=head.next;
        }
        return head;
    }
}
