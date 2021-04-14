public class Testz18 {
   // 操作给定的二叉树，将其变换为源二叉树的镜像
    public TreeNode Mirror (TreeNode pRoot) {
        // write code here
        if(pRoot==null) return null;
        TreeNode node=pRoot.right;
        pRoot.right=pRoot.left;
        pRoot.left=node;
        Mirror(pRoot.left);
        Mirror(pRoot.right);
        return pRoot;
    }
}
