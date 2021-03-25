public class Testz23 {
    //输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则返回true,否则返回false。
    // 假设输入的数组的任意两个数字都互不相同。（ps：我们约定空树不是二叉搜素树）
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence==null || sequence.length==0) return false;
        return bts(sequence,0,sequence.length-1);
    }
    //递归，数组最后一个树是根结点，左子树的值<根<右子树的值
    public boolean bts(int[]sequence,int start,int end){
        if(start>=end) return true;
        int i=start;
        for(;i<end;i++){
            if(sequence[i]>sequence[end]){
                break;
            }
        }
        for(int j=i;j<end;j++){
            if(sequence[j]<sequence[end]){
                return false;
            }
        }
        return bts(sequence,start,i-1)&& bts(sequence,i,end-1);
    }
}
