public class Demo27 {
    public boolean chkPalindrome(ListNode A) {
        // write code here
        ListNode slow=A;
        ListNode fast=A;
        //找到中间节点
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        //将后半部分链表反转
        ListNode cur=slow.next;
        while(cur!=null){
            ListNode curNext=cur.next;
            cur.next=slow;
            slow=cur;
            cur=curNext;
        }
        //两边同时走，奇数时走到中间同一个节点，偶数时判断下一个节点的值是否相等
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
