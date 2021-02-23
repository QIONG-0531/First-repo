public class Test3 {
    //验证回文结构
    public boolean chkPalindrome(ListNode A) {
        ListNode slow=A;
        ListNode fast=A;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode cur = slow.next;
        while (cur != null) {
            ListNode curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        while(A!=slow){
            if(A.val!=slow.val){
                return false;
            }
            if(A.next.val==slow.val){
                return true;
            }
            A=A.next;
            slow=slow.next;
        }
        return true;
    }
}
