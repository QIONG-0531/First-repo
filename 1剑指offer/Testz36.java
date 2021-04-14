class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Testz36 {
    //输入两个链表，找出它们的第一个公共结点
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int length1=0;
        int length2=0;
        ListNode cur1=pHead1;
        ListNode cur2=pHead2;
        while(cur1!=null){
            length1++;
            cur1=cur1.next;
        }
        cur1=pHead1;
        while(cur2!=null){
            length2++;
            cur2=cur2.next;
        }
        cur2=pHead2;
        int len=0;
        if(length1>length2){
            len=length1-length2;
            while(len!=0){
                cur1=cur1.next;
                len--;
            }
        }else{
            len=length2-length1;
            while(len!=0){
                cur2=cur2.next;
                len--;
            }
        }
        while(cur1!=cur2 && cur1!=null){
            cur1=cur1.next;
            cur2=cur2.next;
        }
        if(cur1==cur2){
            return cur1;
        }
        return null;
    }
}
