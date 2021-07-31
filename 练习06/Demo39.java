public class Demo39 {
    public void tree2strChild(TreeNode root,StringBuilder sb){
        //前序遍历（根左右）
        //先设置左的情况，加括号，不加括号，拼接
        sb.append(root.val);
        if(root.left==null){
            if(root.right==null){
                return;
            }else{
                sb.append("()");
            }
        }else{
            sb.append("(");
            tree2strChild(root.left,sb);
            sb.append(")");
        }
        //再设置右的情况，不加括号，拼接
        if(root.right==null){
            return;
        }else{
            sb.append("(");
            tree2strChild(root.right,sb);
            sb.append(")");
        }

    }
    public String tree2str(TreeNode root) {
        //前序遍历（根左右）
        if(root==null) return null;
        StringBuilder sb=new StringBuilder();
        tree2strChild(root,sb);
        return sb.toString();
    }
}
