public class Test3 {
    //根据后序遍历和中序遍历建立二叉树
    public  int postIndex=0;
    public TreeNode buildTreeChild(int[] inorder, int[] postorder,int begin,int end) {
        if(begin>end) return null;
        TreeNode root=new TreeNode(postorder[postIndex]);
        int index=find(inorder,postorder[postIndex],begin,end);
        postIndex--;
        root.right=buildTreeChild(inorder,postorder,index+1,end);//后序遍历先建右树
        root.left=buildTreeChild(inorder,postorder,begin,index-1);
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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder==null || postorder==null) return null;
        if(inorder.length==0 || postorder.length==0)  return null;
        postIndex=postorder.length-1;
        return  buildTreeChild(inorder,postorder,0,inorder.length-1);
    }
}
