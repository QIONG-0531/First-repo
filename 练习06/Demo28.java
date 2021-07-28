public class Demo28 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode cur1=headA;
        ListNode cur2=headB;
        int len1=0;
        int len2=0;
        while(cur1!=null){
            len1++;
            cur1=cur1.next;
        }
        cur1=headA;
        while(cur2!=null){
            len2++;
            cur2=cur2.next;
        }
        cur2=headB;
        int len=0;
        if(len1>len2){
            len=len1-len2;
            while(len!=0){
                cur1=cur1.next;
                len--;
            }
        }else{
            len=len2-len1;
            while(len!=0){
                cur2=cur2.next;
                len--;
            }
        }
        while(cur1!=null){
            if(cur1==cur2){
                return cur1;
            }
            cur1=cur1.next;
            cur2=cur2.next;
        }
        return null;

    }
}
