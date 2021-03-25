import com.sun.xml.internal.bind.v2.util.StackRecorder;

import java.util.*;
public class Testz24 {
    //输入一颗二叉树的根节点和一个整数，按字典序打印出二叉树中结点值的和为输入整数的所有路径。
    // 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
    static List<List<Integer>>ret=new ArrayList<>();
    static List<Integer>list=new ArrayList<>();
    public static List<List<Integer>> pathSum(TreeNode root, int target) {
        path(root,target);
        return ret;
    }
    public static void path(TreeNode root,int target){
        if(root==null) return;
        list.add(root.val);
        target=target-root.val;
        if(target==0 && root.left==null && root.right==null){
            ret.add(new ArrayList<Integer>(list));
        }
        path(root.left,target);
        path(root.right,target);
        list.remove(list.size()-1);//回溯，返回父亲节点之前，先删除该节点
    }
}

