public class Test2 {
    //用前序遍历和中序遍历创建二叉树
    public int preIndex=0;
    public TreeNode buildTreeChild(int[] preorder, int[] inorder,int begin,int end) {
        if(begin>end) return null;
        TreeNode root=new TreeNode(preorder[preIndex]);//先用前序遍历创建根
        int index=find(inorder,preorder[preIndex],begin,end);//在中序遍历里找根节点的位置
        preIndex++;
        root.left=buildTreeChild(preorder,inorder,begin,index-1);
        root.right= buildTreeChild(preorder,inorder,index+1,end);
        return root;
    }
    public int find(int[]inorder,int key,int begin,int end){
        for(int i=begin;i<=end;i++){
            if(inorder[i]==key){
                return i;
            }
        }
        return -1;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder==null || inorder==null) return null;
        return buildTreeChild(preorder,inorder,0,inorder.length-1);
    }
}
