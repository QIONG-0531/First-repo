public class Test2 {
    public ListNode deleteDuplication(ListNode pHead) {
        ListNode node=new ListNode(-1);//增加一个头结点，便于对首元素处理
        node.next=pHead;
        ListNode pre=node;
        ListNode cur=pre.next;
        while(cur!=null){
            if(cur.next!=null && cur.val==cur.next.val){
                while(cur.next!=null && cur.val==cur.next.val){
                    cur=cur.next;
                }
                cur=cur.next;
                pre.next=cur;
            }
            else{
                pre=cur;
                cur=cur.next;
            }
        }
        return node.next;
    }
}
