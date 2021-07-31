import java.util.ArrayList;

public class Demo38 {
    public void inoder(TreeNode root, ArrayList<TreeNode> list){
        if(root==null) return;
        inoder(root.left,list);
        list.add(root);
        inoder(root.right,list);
    }
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null) return null;
        ArrayList<TreeNode> list=new ArrayList<>();
        inoder(pRootOfTree,list);
        TreeNode head=list.get(0);
        TreeNode cur=head;
        for(int i=1;i<list.size();i++){
            TreeNode node=list.get(i);
            node.left=cur;
            cur.right=node;
            cur=node;
        }
        return head;
    }
}
