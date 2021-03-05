import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    public char val;
    public Node left;
    public Node right;

    public Node(char val) {
        this.val = val;
    }
}
class BinaryTree {
    public Node createTree() {
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
       // E.right = H;
        C.left = F;
        C.right = G;
        return A;
    }

    // 层序遍历(队列实现）
    void levelOrderTraversal(Node root) {
        Queue<Node>queue=new LinkedList<>();
        if(root==null) return;
        queue.offer(root);
        while (!queue.isEmpty()){
            Node top=queue.poll();
            System.out.print(top.val);
            if(top.left!=null){
                queue.offer(top.left);
            }
            if(top.right!=null){
                queue.offer(top.right);
            }
        }
    }

    // 判断一棵树是不是完全二叉树
    boolean isCompleteTree(Node root) {
        Queue<Node> queue=new LinkedList<>();
        if(root==null) return false;
        queue.offer(root);
        while(!queue.isEmpty()){
            Node top=queue.poll();
            if (top!=null){
                queue.offer(top.left);
                queue.offer(top.right);
            }
            else{
                break;
            }
        }//如果为完全二叉树，此时队列里只有null
        while(!queue.isEmpty()){
            Node cur=queue.peek();
            if(cur==null){
                queue.poll();
            }
            else{
                return false;
            }
        }
        return true;
    }
}
public class Test1 {
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        Node root=binaryTree.createTree();
        binaryTree.levelOrderTraversal(root);
        System.out.println();
        System.out.println(binaryTree.isCompleteTree(root));
    }

}
