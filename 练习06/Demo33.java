public class Demo33 {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        if(Math.abs(high(root.left)-high(root.right))>1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    public int high(TreeNode root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        int left=high(root.left);
        int right=high(root.right);
        return Math.max(left,right)+1;
    }
}
