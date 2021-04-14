public class Testz39 {
    //判断一棵树是否是平衡树
    //它是一棵空树或它的左右两个子树的高度差的绝对值不超过1，并且左右两个子树都是一棵平衡二叉树。
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null) return true;
        int left=TreeDepth(root.left);
        int right=TreeDepth(root.right);
        if(Math.abs(left-right)>1){
            return false;
        }
        return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);
    }
    public int TreeDepth(TreeNode root) {
        if(root==null)return 0;
        if(root.left==null && root.right==null)return 1;
        int left=TreeDepth(root.left);
        int right=TreeDepth(root.right);
        return left>right?left+1:right+1;
    }
}
