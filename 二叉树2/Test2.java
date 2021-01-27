import java.util.LinkedList;
import java.util.Queue;

public class Test2 {
    //给定一个二叉树，编写一个函数来获取这个树的最大宽度。树的宽度是所有层中的最大宽度。
    // 这个二叉树与满二叉树（full binary tree）结构相同，但一些节点为空。
    public int widthOfBinaryTree(TreeNode root) {
        LinkedList<Integer> length=new LinkedList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        int ret=0;
        int max=1;
        if(root==null) return -1;
        queue.offer(root);
        length.add(1);
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size!=0){
                TreeNode cur=queue.poll();
                int index=length.removeFirst();
                if(cur.left!=null){
                    queue.offer(cur.left);
                    length.add(index*2);
                }
                if(cur.right!=null){
                    queue.offer(cur.right);
                    length.add(index*2+1);
                }
                size--;
            }
            if(length.size()>=2){
                ret=length.getLast()-length.getFirst()+1;
            }
            if(ret>=max){
                max=ret;
            }
        }
        return max;
    }
}

