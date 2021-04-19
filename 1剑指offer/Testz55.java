class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Testz55 {
    //链表中环的入口节点
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if(pHead==null) return null;
        if(pHead.next==null)  return null;
        ListNode fast=pHead;
        ListNode slow=pHead;
        while(fast!=null){//快慢指针寻找相遇点
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow) break;
        }
        if(fast==null) return null;
        fast=pHead;
        while(fast!=slow){//一个从头走，一个从相遇点开始走，再次相遇的点就是入口点
            fast=fast.next;
            slow=slow.next;
        }
        return fast;

    }

}
