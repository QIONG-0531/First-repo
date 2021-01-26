import java.util.ArrayList;
import java.util.List;
//按中序遍历将树转化为只有右子树的递增树
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
    List<Integer> list=new ArrayList<>();
    public List<Integer>  mid(TreeNode root){
        if(root==null) {
            return list;
        }
        mid(root.left);
        list.add(root.val);
        mid(root.right);
        return list;
    }
    public TreeNode increasingBST(TreeNode root) {
        List<Integer>arr=new ArrayList<>();
        arr=mid(root);
        TreeNode newroot=new TreeNode(arr.get(0));
        TreeNode cur=newroot;
        for(int i=1;i<arr.size();i++){
            cur.right=new TreeNode(arr.get(i));
            cur=cur.right;
        }
        return newroot;

    }
}
public class Test1 {
}
