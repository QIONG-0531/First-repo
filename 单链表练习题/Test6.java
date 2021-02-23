public class Test6 {
    //返回链表开始入环的第一个结点
    public ListNode hasCycle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return fast;
            }
        }
        return null;
    }
    public ListNode detectCycle(ListNode head) {
        if(hasCycle(head)==null) return null;
        ListNode slow=head;
        ListNode fast=hasCycle(head);
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return fast;
    }
}
