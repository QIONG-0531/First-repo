class ListNode {
      int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class Test {
    //反转单链表
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        ListNode pre=head;
        ListNode cur=pre.next;
        pre.next=null;
        while(cur!=null){
            ListNode curNext=cur.next;
            cur.next=pre;
            pre=cur;
            cur=curNext;
        }
        head=pre;
        return  head;
    }
    //返回中间节点
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    //输入一个链表，输出该链表中倒数第k个结点。
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null) return null;
        ListNode fast=head;
        ListNode slow=head;
        while((k-1)!=0){
            fast=fast.next;
            if(fast==null) return null;
            k--;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}
