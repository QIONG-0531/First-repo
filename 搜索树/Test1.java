import sun.applet.AppletResourceLoader;

class BinarySearchTree {
    static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node(int val) {
            this.val = val;
        }
    }
        public Node root=null;
        public Node Search(int val){
            Node cur=root;
            while(cur!=null){
                if(val>cur.val){
                    cur=cur.right;
                }
                else if(val<cur.val){
                    cur=cur.left;
                }
                else{
                    return cur;
                }
            }
            return null;
        }
        public boolean insert(int val) {
            Node node = new Node(val);
            if (root == null) {
                root = node;
                return true;
            }
            Node cur = root;
            Node prev = null;
            while (cur != null) {
                if (val > cur.val) {
                    prev=cur;
                    cur = cur.right;
                } else if (val < cur.val) {
                    prev=cur;
                    cur = cur.left;
                } else {
                    return false;
                }
            }
            if (val > prev.val) {
                prev.right = node;
            } else {
                prev.left = node;
            }
            return true;
        }
    }
public class Test1{
    public static void prevoder(BinarySearchTree.Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        prevoder(root.left);
        prevoder(root.right);
    }
    public static void inorder(BinarySearchTree.Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree= new BinarySearchTree();
        binarySearchTree.insert(4);
        binarySearchTree.insert(3);
        binarySearchTree.insert(1);
        binarySearchTree.insert(15);
        binarySearchTree.insert(11);

        prevoder(binarySearchTree.root);
        System.out.println();
        inorder(binarySearchTree.root);
        System.out.println();
    }
}
