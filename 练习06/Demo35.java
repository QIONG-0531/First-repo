import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Demo35 { public List<List<Integer>> levelOrder(TreeNode root) {
    //1.使用队列
    //2.使用size来规定每个链表的长度
    List<List<Integer>> ret=new ArrayList<>();
    Queue<TreeNode> queue=new LinkedList<>();
    if(root==null) return ret;
    queue.offer(root);
    while(!queue.isEmpty()){
        int size=queue.size();
        List<Integer> list=new ArrayList<>();
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
