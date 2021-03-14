class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Testz15 {
    //反转单链表
    public ListNode ReverseList(ListNode head) {
        if(head==null) return null;
        ListNode cur=head;
        ListNode pre=null;
        while(cur!=null){
            ListNode curNext=cur.next;
            cur.next=pre;
            pre=cur;
            cur=curNext;
        }
        return pre;
    }
}
