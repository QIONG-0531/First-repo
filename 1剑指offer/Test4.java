public class Test4 {
    //根据前序遍历和中序遍历建立二叉树
    public int preIndex=0;
    public TreeNode child(int[]pre,int[]in,int begin,int end){
        if(begin>end) return null;
        TreeNode root=new TreeNode(pre[preIndex]);
        int index=find(in,pre[preIndex],begin,end);
        preIndex++;
        root.left=child(pre,in,begin,index-1);
        root.right=child(pre,in,index+1,end);
        return root;
    }
    public int find(int[]in,int key,int begin,int end){
        for(int i=begin;i<=end;i++){
            if(in[i]==key){
                return i;
            }
        }
        return -1;
    }
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre==null || in==null) return null;
        return child(pre,in,0,in.length-1);
    }
}
