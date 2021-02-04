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
    public void remove(int val) {
        if(root == null) return;
        Node cur = root;
        Node parent = null;
        while (cur != null) {
            if(cur.val == val) {
                removeNode(parent,cur,val);
                return;
            }else if(cur.val < val) {
                parent = cur;
                cur = cur.right;
            }else {
                parent = cur;
                cur = cur.left;
            }
        }
    }

    /**
     * 删除二叉搜索树的节点
     * @param parent
     * @param cur
     * @param val
     */
    public void removeNode(Node parent,Node cur,int val) {
        if(cur.left == null) {
             if(cur==root){
                 root=cur.right;
             }
             if(cur==parent.left){
                 parent.left=cur.right;
             }
             if(cur==parent.right){
                 parent.right=cur.right;
             }
        }else if(cur.right == null) {
                   if(cur==root){
                       root=cur.left;
                   }
                   if(cur==parent.left){
                       parent.left=cur.left;
                   }
                   if(cur==parent.right){
                       parent.right=cur.left;
                   }
        }else {
            Node targetparent=cur;
            Node target=cur.right;
            while(target.left!=null){
                targetparent=target;
                target=target.left;
            }
            cur.val=target.val;
            if(targetparent.left==target){
                targetparent.left=target.right;
            }else{
                targetparent.right=target.right;
            }
        }
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
