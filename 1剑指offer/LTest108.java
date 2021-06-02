public class LTest108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        //二叉搜索树，中序遍历是有序的
        //给的数组是中序遍历的结果
        return tree(nums,0,nums.length-1);
    }
    public TreeNode tree(int[]nums,int left,int right){
        if(left>right) return null;
        int mid=(left+right)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=tree(nums,left,mid-1);
        root.right=tree(nums,mid+1,right);
        return root;
    }
}
