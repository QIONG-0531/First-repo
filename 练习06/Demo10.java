public class Demo10 {
    public ListNode partition(ListNode pHead, int x) {
        ListNode small=new ListNode(-1);
        ListNode cur1=small;
        ListNode large=new ListNode(-1);
        ListNode cur2=large;
        while(pHead!=null){
            if(pHead.val<x){
                cur1.next=new ListNode(pHead.val);
                cur1=cur1.next;
            }else{
                cur2.next=new ListNode(pHead.val);
                cur2=cur2.next;
            }
            pHead=pHead.next;
        }
        if(small.next==null){
            return large.next;
        }
        else if(large.next==null){
            return small.next;
        }else{
            cur1.next=large.next;
            return small.next;
        }
    }
}
