public class Test46 {
    public int getMost(int[][] board) {
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if(i==0 && j==0){
                    continue;
                } else if(i==0) {
                    board[i][j]+=board[i][j-1];
                }else if(j==0){
                    board[i][j]+=board[i-1][j];
                }else{
                    board[i][j]+=Math.max(board[i-1][j],board[i][j-1]);
                }
            }
        }
        return board[5][5];
    }
}

