import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
  }
public class Test8 {
    //前序遍历（迭代方法，递归其实是隐藏了栈）
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        if(root==null) return list;
        TreeNode node=root;
        while(node!=null || !stack.isEmpty()){
            while(node!=null){
                list.add(node.val);
                stack.push(node);
                node=node.left;
            }
            TreeNode top=stack.pop();
            node=top.right;
        }
        return list;
    }
    //中序遍历
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        if(root==null) return list;
        Stack<TreeNode>stack=new Stack<>();
        TreeNode cur=root;
        while(cur!=null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode  top = stack.pop();
            list.add(top.val);
            cur = top.right;
        }
        return list;
    }
    //后序遍历
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        Stack<TreeNode>stack=new Stack<>();
        TreeNode prev = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.right == null || root.right == prev) {
                list.add(root.val);
                prev = root;
                root = null;
            } else {
                stack.push(root);
                root = root.right;
            }
        }
        return list;
    }
}
