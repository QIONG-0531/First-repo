public class LTest112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        //到达叶子节点后，判断当前val是不是最后的值
        if(root.left==null && root.right==null){
            return targetSum==root.val;
        }
        return hasPathSum(root.left,targetSum-root.val)|| hasPathSum(root.right,targetSum-root.val);
    }
}
