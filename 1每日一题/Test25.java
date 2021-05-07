import java.util.ArrayList;
import java.util.Scanner;

public class Test25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int n = in.nextInt();
            System.out.println(num(n));
        }
    }
    public static int num(int n){
        int[][]array=new int[n+1][2*n];
        array[1][1]=1;
        for(int i=2;i<=n;i++){
            array[i][1]=1;
            for(int j=2;j<=2*n-1;j++){
                array[i][j]=array[i-1][j-1]+array[i-1][j-2]+array[i-1][j];
            }
        }
        for(int i=1;i<=n;i++){
            if(array[n][i]%2==0){
                return i;
            }
        }
        return -1;
    }
}
