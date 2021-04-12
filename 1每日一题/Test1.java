import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    //组队竞赛
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int n=in.nextInt();
            long[]array=new long[3*n];
            for(int i=0;i<array.length;i++){
                array[i]=in.nextLong();
            }
            Arrays.sort(array);
            long sum=0;//类型一定要是long，不然数字太大会越界
            for(int i=array.length-2;i>=n;i-=2){
                sum+=array[i];
            }
            System.out.print(sum);
        }
    }
}
