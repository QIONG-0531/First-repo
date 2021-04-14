import java.util.ArrayList;
    class ListNode {
        int val;
        ListNode next = null;

         ListNode(int val) {
             this.val = val;
         }
     }
     class Solution {
        //输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer>list=new ArrayList<>();
        if(listNode==null) return list;
        ListNode pre=listNode;
        ListNode cur=pre.next;
        pre.next=null;
        while(cur!=null){
            ListNode curNext=cur.next;
            cur.next=pre;
            pre=cur;
            cur=curNext;
        }
        while(pre!=null){
            list.add(pre.val);
            pre=pre.next;
        }
        return list;
    }
}
public class Test3 {
}
