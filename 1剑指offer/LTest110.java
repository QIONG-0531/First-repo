public class LTest110 {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        if(Math.abs(len(root.left)-len(root.right))>1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    public int len(TreeNode root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        int left=len(root.left);
        int right=len(root.right);
        return left>right?left+1:right+1;
    }
}

