import java.util.*;
class TreeNode {
 int val = 0;
 TreeNode left = null;
 TreeNode right = null;

 public TreeNode(int val) {
 this.val = val;

 }
 }
public class Testz22 {
    //从上往下打印出二叉树的每个节点，同层节点从左至右打印。(层序遍历）
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer>list=new ArrayList<>();
        Queue<TreeNode>queue=new LinkedList<>();
        if(root==null) return list;
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode cur=queue.poll();
            list.add(cur.val);
            if(cur.left!=null){
                queue.offer(cur.left);
            }
            if(cur.right!=null){
                queue.offer(cur.right);
            }
        }
        return list;
    }
}
