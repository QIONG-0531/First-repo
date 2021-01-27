public class Test6 {
    //给定一个二叉树，判断它是否是高度平衡的二叉树。
    public int  High(TreeNode root) {
        if(root==null) return 0;
        int leftHigh=High(root.left);
        int rightHigh=High(root.right);
        if(leftHigh>=0  &&  rightHigh>=0 && Math.abs(leftHigh-rightHigh)<=1){
            return Math.max(leftHigh,rightHigh)+1;
        }
        else{
            return -1;
        }
    }
    public boolean isBalanced(TreeNode root) {
        if(High(root)>=0) {
            return true;
        }else{
            return false;
        }


    }
}
