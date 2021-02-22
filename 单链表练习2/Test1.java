public class Test1 {
    //合并两个有序链表
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newHead=new ListNode(-1);
        ListNode cur=newHead;
        ListNode cur1=l1;
        ListNode cur2=l2;
        while(cur1!=null && cur2!=null){
            if(cur1.val<cur2.val){
                cur.next=cur1;
                cur1=cur1.next;
            }
            else{
                cur.next=cur2;
                cur2=cur2.next;
            }
            cur=cur.next;
        }
        if(cur1!=null){
            cur.next=cur1;
        }
        if(cur2!=null){
            cur.next=cur2;
        }
        return newHead.next;
    }
    //以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
    public ListNode partition(ListNode pHead, int x) {
        ListNode cur=pHead;
        ListNode smallHead=new ListNode(-1);
        ListNode small=smallHead;
        ListNode bigHead=new ListNode(-1);
        ListNode big=bigHead;
        while(cur!=null){
            if(cur.val<x){
                small.next=new ListNode(cur.val);
                small=small.next;
            }
            else{
                big.next=new ListNode(cur.val);
                big=big.next;
            }
            cur=cur.next;
        }
        small.next=bigHead.next;
        big.next=null;
        return smallHead.next;
    }
}

