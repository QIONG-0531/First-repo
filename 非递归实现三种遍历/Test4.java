import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Test4 {
    //非递归实现前序遍历（用栈，先进后出）
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        if(root==null) return list;
        Stack<TreeNode> stack=new Stack<>();
        TreeNode cur=root;
        while(cur!=null || !stack.isEmpty()){
            while(cur!=null){
                stack.push(cur);
                list.add(cur.val);//根左右
                cur=cur.left;
            }
            TreeNode top=stack.pop();
            cur=top.right;
        }
        return list;
    }
//非递归实现中序遍历
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        Stack<TreeNode>stack=new Stack<>();
        if(root==null) return list;
        TreeNode cur=root;
        while(cur!=null || !stack.isEmpty()){
            while(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            TreeNode top=stack.pop();
            list.add(top.val);//左根右
            cur=top.right;
        }
        return list;
    }
//非递归实现后序遍历
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        Stack<TreeNode>stack=new Stack<>();
        TreeNode cur=root;
        TreeNode pre=null;
        while(cur!=null || !stack.isEmpty()){
            while(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            TreeNode top=stack.peek();//拿出栈顶元素看右边是否为空，为空打印
            if(top.right==null || top.right==pre){//判断当前节点是否已经打印过了
                stack.pop();
                list.add(top.val);
                pre=top;//用pre记录打印过的结点
            }else{
                cur=top.right;
            }
        }
        return list;
    }
}
