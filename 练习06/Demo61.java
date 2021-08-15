import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
class Node1 {
    public int val;
    public Node1 left;
    public Node1 right;

    public Node1() {}

    public Node1(int _val) {
        val = _val;
    }

    public Node1(int _val,Node1 _left,Node1 _right) {
        val = _val;
        left = _left;
        right = _right;
    }
}
public class Demo61 {
    public Node1 treeToDoublyList(Node1 root) {
        if(root==null) return null;
        //中序遍历
        List<Integer> list=new ArrayList<>();
        inoder(root,list);
        Node1 head=new Node1(list.get(0));
        Node1 cur=head;
        int i=1;
        while(i<list.size()){
            Node1 node=new Node1(list.get(i));
            cur.right=node;
            node.left=cur;
            cur=cur.right;
            i++;
        }
        cur.right=head;
        head.left=cur;

        return head;
    }
    public void inoder(Node1 root,List<Integer> list){
        if(root==null) return;
        inoder(root.left,list);
        list.add(root.val);
        inoder(root.right,list);
    }
}
