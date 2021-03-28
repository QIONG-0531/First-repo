import java.util.HashMap;

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

public class Test3 {
    //复制带随机指针的链表
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map=new HashMap<>();
        Node cur=head;
        //先遍历单链表，保存新老节点的对应关系
        while(cur!=null){
            Node node=new Node(cur.val);
            map.put(cur,node);
            cur=cur.next;
        }
        //再遍历单链表，维护新链表的next和random
        cur=head;
        while(cur!=null){
            map.get(cur).next=map.get(cur.next);
            map.get(cur).random=map.get(cur.random);
            cur=cur.next;
        }
        return map.get(head);
    }
}
