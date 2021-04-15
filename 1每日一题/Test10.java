import java.util.Scanner;

public class Test10 {
    //连续最大和
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[]array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=in.nextInt();
        }
        int max=array[0];
        for(int i=1;i<array.length;i++){
            array[i]+=array[i-1]>0?array[i-1]:0;//当前位置的数字就是截至当前位置的连续数组最大和
            max=Math.max(max,array[i]);//当前和为负数，就为0重新开始
        }
        System.out.println(max);

    }
}
