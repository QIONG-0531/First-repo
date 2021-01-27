import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}
public class Test1 {
    //层序遍历
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ret=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null) return ret;
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer>list=new ArrayList<>();
            int size=queue.size();
            while(size!=0){
                TreeNode cur=queue.poll();
                list.add(cur.val);
                if(cur.left!=null){
                    queue.offer(cur.left);
                }
                if(cur.right!=null){
                    queue.offer(cur.right);
                }
                size--;
            }
            ret.add(list);
        }
        return ret;
    }
}
