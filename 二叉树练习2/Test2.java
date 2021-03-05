import java.util.Scanner;
// 例如如下的先序遍历字符串： ABC##DE#G##F### 其中“#”表示的是空格，空格字符代表空树。
// 建立起此二叉树以后，再对二叉树进行中序遍历，输出遍历结果。
public class Test2 {
    static int i=0;
    public static Node creat(String str){
        Node root=null;
        if(str==null) return null;
        if(str.charAt(i)!='#'){
            root=new Node(str.charAt(i));
            i++;
            root.left=creat(str);
            root.right=creat(str);
        }
        else{
            i++;
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        Node root=creat(str);
        inorder(root);
    }
}
