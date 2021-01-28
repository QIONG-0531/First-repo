public class Test3 {
    //输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
    // 要求不能创建任何新的结点，只能调整树中结点指针的指向。
    public  TreeNode prev=null;
    public void ConvertChild(TreeNode pcur){
        if(pcur==null) return;
        ConvertChild(pcur.left);
        pcur.left=prev;
        if(prev!=null){
            prev.right=pcur;
        }
        prev=pcur;
        ConvertChild(pcur.right);
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
