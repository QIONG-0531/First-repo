import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class Testz60 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(pRoot);
        ArrayList<ArrayList<Integer>> ret=new ArrayList<>();
        if(pRoot==null) return ret;
        while(!queue.isEmpty()){
            ArrayList<Integer>list=new ArrayList<>();
            int size=queue.size();
            while(size!=0){
                TreeNode tmp=queue.poll();
                list.add(tmp.val);
                if(tmp.left!=null) queue.offer(tmp.left);
                if(tmp.right!=null) queue.offer(tmp.right);
                size--;
            }
            ret.add(list);
        }
        return ret;
    }
}

