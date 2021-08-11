import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Demo50 {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null) return null;
        //中序遍历
        List<TreeNode> list = new ArrayList<>();
        inorder(pRootOfTree,list);
        if(list==null )return null;
        TreeNode head=list.get(0);
        int i=1;
        TreeNode cur=head;
        while(i<list.size()){
            cur.right = list.get(i);
            list.get(i).left=cur;
            cur=cur.right;
            i++;
        }
        return head;
    }
    public void inorder(TreeNode root,List<TreeNode>  list){
        if(root==null) return;
        inorder(root.left,list);
        list.add(root);
        inorder(root.right,list);
        HashMap
    }
}
