import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;

public class Testz62 {
    //给定一棵二叉搜索树，请找出其中的第k小的TreeNode结点。
    LinkedList<TreeNode>list=new LinkedList<>();
    TreeNode KthNode(TreeNode pRoot, int k) {
        inorder(pRoot);
        if(k>=1 && list.size()>=k) {
            return list.get(k-1);
        }
        return null;
    }
    void inorder(TreeNode pRoot){
        if(pRoot==null) return;
        inorder(pRoot.left);
        list.add(pRoot);
        inorder(pRoot.right);
    }
}
