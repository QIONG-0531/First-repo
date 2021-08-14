import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class Solution {
    public Node copyRandomList(Node head) {
        //使用哈希表，新建一组单链表的节点，保持对应关系
        if(head ==null) return null;
        HashMap<Node,Node> map=new HashMap<>();
        Node cur=head;
        while(cur!=null){
            map.put(cur,new Node(cur.val));
            cur=cur.next;
        }
        cur=head;
        //再次遍历单链表，连接next、random
        while(cur!=null){
            map.get(cur).next=map.get(cur.next);
            map.get(cur).random=map.get(cur.random);
            cur=cur.next;
        }
        return map.get(head);


    }
}
public class Demo59 {
    PriorityQueue<Integer> queue=new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    });

}
