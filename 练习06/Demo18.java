public class Demo18 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p==root) return p;
        if(q==root) return q;
        if(p.val<root.val && q.val<root.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        if(q.val>root.val && p.val>root.val){
            return lowestCommonAncestor(root.right,p,q);
        }
        return root;
    }
}
