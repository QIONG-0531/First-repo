public class Demo9 {
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
