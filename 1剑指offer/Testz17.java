class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class Testz17 {
    //输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1==null || root2==null) return false;
        if(Sametree(root1,root2)) return true;
        return  HasSubtree(root1.left,root2) ||
                HasSubtree(root1.right,root2);
    }
    public boolean Sametree(TreeNode root1,TreeNode root2){
        if(root2==null) return true;//节点全都符合
        if(root1==null) return false;//结点没走完
        if(root1.val!=root2.val) return false;
        return Sametree(root1.left,root2.left)&&
                Sametree(root1.right,root2.right);
    }
}
