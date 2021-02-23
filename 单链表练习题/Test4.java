public class Test4 {
    //找两个链表相交的第一个结点
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int count1=0;
        ListNode cur1=headA;
        while(cur1!=null){
            cur1=cur1.next;
            count1++;
        }
        int count2=0;
        ListNode cur2=headB;
        while(cur2!=null){
            cur2=cur2.next;
            count2++;
        }
        cur1=headA;
        cur2=headB;
        if(count1>count2){
            while((count1-count2)!=0){
                cur1=cur1.next;
                count1--;
            }
        }
        if(count2>count1){
            while((count2-count1)!=0){
                cur2=cur2.next;
                count2--;
            }
        }
        while(cur1!=cur2){
            cur1=cur1.next;
            cur2=cur2.next;
        }
        return cur1;
    }
}
