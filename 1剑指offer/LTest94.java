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
    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            //中序：左根右
            List<Integer>list=new ArrayList<>();
            inorder(root,list);
            return list;
        }
        public void inorder(TreeNode root,List<Integer>  list){
            if(root==null) return;
            inorder(root.left,list);
            list.add(root.val);
            inorder(root.right,list);
        }
    }
        public List<Integer> inorderTraversal2(TreeNode root) {
            List<Integer> list=new ArrayList<>();
            if(root==null) return list;
            Stack<TreeNode> stack=new Stack<>();
            TreeNode cur=root;
            while(cur!=null || !stack.isEmpty()){
                while(cur!=null){
                    stack.push(cur);
                    cur=cur.left;
                }
                TreeNode top=stack.pop();
                list.add(top.val);
                if(top.right!=null){
                    cur=top.right;
                }
            }
            return list;
        }
}
