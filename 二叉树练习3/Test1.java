class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class Test1 {
    //输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
    // 要求不能创建任何新的结点，只能调整树中结点指针的指向。
    public TreeNode prev=null;
    public void ConvertChild(TreeNode pCur){//二叉搜索树中序遍历是有序的
        if(pCur==null) return;
        ConvertChild(pCur.left);
        pCur.left=prev;//链表的前驱用left表示，后继用right表示
        if(prev!=null){
            prev.right=pCur;//最左边的结点只用设置前驱为空
        }
        prev=pCur;
        ConvertChild(pCur.right);
    }
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null) return null;
        ConvertChild(pRootOfTree);
        TreeNode head=pRootOfTree;
        while(head.left!=null){
            head=head.left;
        }
        return head;
    }
}
