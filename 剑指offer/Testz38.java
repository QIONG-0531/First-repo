 class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;

     public TreeNode(int val) {
     this.val = val;

     }
     }

    public class Testz38 {
    //求树的深度
        public int TreeDepth(TreeNode root) {
            if(root==null)return 0;
            if(root.left==null && root.right==null)return 1;
            int left=TreeDepth(root.left);
            int right=TreeDepth(root.right);
            return left>right?left+1:right+1;
        }
    }

