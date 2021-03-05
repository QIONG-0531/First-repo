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
public class Test {
    //相同的数
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null && q!=null) return false;
        if(p!=null && q==null) return false;
        if(p.val!=q.val) return false;
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
    //另一个树的子树
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null && t!=null) return false;
        if(isSameTree1(s,t)) return true;
        return  isSubtree(s.left,t) || isSubtree(s.right,t);
    }
    public boolean isSameTree1(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null && q!=null) return false;
        if(p!=null && q==null) return false;
        if(p.val!=q.val) return false;
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
    //二叉树的最大深度
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        return left>right?left+1:right+1;
    }
    //给定一个二叉树，判断它是否是高度平衡的二叉树。
     public boolean isBalanced(TreeNode root) {
            if(root==null) return true;
            if(Math.abs(maxDepth1(root.left)-maxDepth1(root.right)) >1) return false;
            return isBalanced(root.left) && isBalanced(root.right);
        }
        public int maxDepth1(TreeNode root) {
          if(root==null) return 0;
          if(root.left==null && root.right==null) return 1;
          int left=maxDepth(root.left);
          int right=maxDepth(root.right);
          return left>right?left+1:right+1;
        }
        //给定一个二叉树，检查它是否是镜像对称的。
        public boolean isSymmetric(TreeNode root) {
            if(root==null) return true;
            return isSametree2(root.left,root.right);
        }
    public boolean isSametree2(TreeNode p,TreeNode q){
        if(p==null && q==null)return true;
        if(p==null && q!=null)return false;
        if(p!=null && q==null) return false;
        if(p.val!=q.val) return false;
        return isSametree2(p.left,q.right) && isSametree2(p.right,q.left);
    }
}
