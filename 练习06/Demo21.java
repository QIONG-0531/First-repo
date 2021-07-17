import java.util.ArrayList;
import java.util.List;

public class Demo21 {
    List<String> list=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        findPath(root,"");
        return list;
    }
    public void findPath(TreeNode root,String path){
        if(root==null) return;
        findPath(root.left,path+root.val+"->");
        findPath(root.right,path+root.val+"->");
        if(root.left==null && root.right==null){
            list.add(path+root.val);
        }
    }
}
