public class Demo57 {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0) return new int[0];
        int row=matrix.length;
        int col=matrix[0].length;
        int[] ret=new int[row*col];
        int k=0;
        int left=0;
        int top=0;
        int right=col-1;
        int bottom=row-1;
        while(true){
            //从左往右
            for(int i=left;i<=right;i++){
                ret[k++]=matrix[top][i];
            }
            top++;
            if(top>bottom) break;
            //从上往下
            for(int i=top;i<=bottom;i++){
                ret[k++]=matrix[i][right];
            }
            right--;
            if(right<left) break;
            //从右往左
            for(int i=right;i>=left;i--){
                ret[k++]=matrix[bottom][i];
            }
            bottom--;
            if(bottom<top) break;
            //从下往上
            for(int i=bottom;i>=top;i--){
                ret[k++]=matrix[i][left];
            }
            left++;
            if(left>right) break;
        }
        return ret;

    }
}
