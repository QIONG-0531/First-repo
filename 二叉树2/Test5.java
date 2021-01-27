public class Test5 {
    //给定一个二叉树，检查它是否是镜像对称的。
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null && q!=null) return false;
        if(p!=null && q==null) return false;
        if(p.val!=q.val) return false;
        return isSameTree(p.left,q.right)&&isSameTree(p.right,q.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return isSameTree(root.left,root.right);
    }
}
