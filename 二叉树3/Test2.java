import java.util.*;
//class TreeNode {
//    char val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode(char x) { val = x; }
//}
// 例如如下的先序遍历字符串： ABC##DE#G##F### 其中“#”表示的是空格，空格字符代表空树。
// 建立起此二叉树以后，再对二叉树进行中序遍历，输出遍历结果。
public class Test2 {
    public static int i=0;
    public static TreeNode creat(String str){
        if(str==null) return  null;
        TreeNode root=null;
        if(str.charAt(i)!='#'){
            root=new TreeNode(str.charAt(i));
            i++;
            root.left=creat(str);
            root.right=creat(str);
        }else{
            i++;
        }
        return root;
    }
    // 中序遍历
    public static void inOrderTraversal(TreeNode root) {
        if(root==null) return;
        inOrderTraversal(root.left);
        System.out.print(root.val+" ");
        inOrderTraversal(root.right);
    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        TreeNode root=creat(str);
        inOrderTraversal(root);
    }
}
