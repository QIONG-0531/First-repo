import java.util.Scanner;

public class Test11 {
    //不要二的网格分蛋糕
    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        int W=in.nextInt();
        int H=in.nextInt();
        int[][]array=new int[H][W];
        int count=0;
        for(int i=0;i<H;i++){
            for(int j=0;j<W;j++){
                if(isOk(i,j,array)){
                    count++;
                    array[i][j]=2;
                }
            }
        }
        System.out.println(count);
    }
    public static boolean isOk(int i,int j,int[][]array){
        if((j+2)<array[0].length && array[i][j+2]==2){
            return false;
        }
        if((j-2)>=0 && array[i][j-2]==2){
            return false;
        }
        if((i+2)<array.length && array[i+2][j]==2){
            return false;
        }
        if((i-2)>=0&& array[i-2][j]==2){
            return false;
        }
        return true;
    }
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int W=in.nextInt();
            int H=in.nextInt();
            int[][]array=new int[W][H];
            int count=0;
            for(int i=0;i<W;i++){
                for(int j=0;j<H;j++){
                    if(array[i][j]==0){
                        count++;
                        if((i+2)<W ){
                            array[i+2][j]=-1;
                        }
                        if((i-2)>=0){
                            array[i-2][j]=-1;
                        }
                        if((j+2)<H ){
                            array[i][j+2]=-1;
                        }
                        if((j-2)>=0){
                            array[i][j-2]=-1;
                        }
                    }

                }
            }
            System.out.println(count);
        }
}
