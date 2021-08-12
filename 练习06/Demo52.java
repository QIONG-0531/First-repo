public class Demo52 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0){
            return false;
        }
        //右上角为出发点，如果该小标的值小于目标值，就向下；大于，向左
        int row=0;
        int col=matrix[0].length-1;
        while(row <matrix.length && col>=0){
            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]<target){
                row++;
            }else{
                col--;
            }
        }
        return false;

    }
}
