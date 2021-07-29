import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Demo32 {
    public List<Integer> inorderTraversal(TreeNode root) {
        //左根右
        List<Integer> list=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        TreeNode cur=root;
        while(cur!=null ||  !stack.isEmpty()){
            while(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            TreeNode top=stack.pop();
            list.add(top.val);
            cur=top.right;

        }
        return list;
    }
}
