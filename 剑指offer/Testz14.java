class ListNode {
    int val;
    ListNode next = null;
    public ListNode(int val) {
        this.val = val;
   }
 }
 //输入一个链表，输出该链表中倒数第k个结点
public class Testz14 {
    public ListNode FindKthToTail (ListNode pHead, int k) {
        if(pHead==null || k==0) return null;
        ListNode fast=pHead;
        ListNode slow=pHead;
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
