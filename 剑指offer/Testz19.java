import java.util.ArrayList;

public class Testz19 {
    //输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
    // 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
    // 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list=new ArrayList<>();
        if(matrix==null || matrix.length==0) return list;
        //上下左右四个边界
        int up=0;
        int down=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        while(true){
            //先打印最上面一行
            for(int i=left;i<=right;i++){
                list.add(matrix[up][i]);
            }
            up++;//向下
            if(up>down){
                break;//查看会不会越界
            }
            //右边一列
            for(int i=up;i<=down;i++){
                list.add(matrix[i][right]);
            }
            right--;//向左
            if(left>right){
                break;//越界
            }
            //下面一行
            for(int i=right;i>=left;i--){
                list.add(matrix[down][i]);
            }
            down--;
            if(up>down){
                break;
            }

            //左边一列
            for(int i=down;i>=up;i--){
                list.add(matrix[i][left]);
            }
            left++;
            if(left>right){
                break;
            }
        }
        return list;
    }
}
