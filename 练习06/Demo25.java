public class Demo25 {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        ListNode small=new ListNode(-1);
        ListNode large=new ListNode(-1);
        ListNode scur=small;
        ListNode lcur=large;
        while(pHead!=null){
            if(pHead.val<x){
                scur.next=new ListNode(pHead.val);
                scur=scur.next;
            }else{
                lcur.next=new ListNode(pHead.val);
                lcur=lcur.next;
            }
            pHead=pHead.next;
        }
        if(small.next==null){
            return large.next;
        }
        scur.next=large.next;
        return small.next;

    }
}
