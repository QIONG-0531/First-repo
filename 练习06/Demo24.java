public class Demo24 {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null || k<=0) return null;
        ListNode fast=head;
        ListNode slow=head;
        while((k-1)!=0){
            fast=fast.next;
            k--;
        }
        if(fast==null) return null;
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;

    }
}
