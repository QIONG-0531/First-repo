class ListNode {
     int val;
      ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Ltest1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root=new ListNode(0);
        ListNode head=root;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0){
            int l1val=l1!=null ? l1.val:0;
            int l2val=l2!=null ? l2.val:0;
            int sum=l1val+l2val+carry;
            carry=sum/10;
            ListNode cur=new ListNode(sum%10);
            head.next=cur;
            head=cur;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        return root.next;
    }
}
