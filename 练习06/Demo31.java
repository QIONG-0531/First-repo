import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Demo31 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        TreeNode cur=root;
        Stack<TreeNode> stack=new Stack<>();
        while(cur!=null || !stack.isEmpty()){
            while(cur!=null){
                list.add(cur.val);
                stack.push(cur);
                cur=cur.left;
            }
            TreeNode top=stack.pop();
            cur=top.right;
        }
        return list;

    }
}
