import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test38 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count=in.nextInt();
        while(count!=0){
            int n=in.nextInt();
            int k=in.nextInt();
            int[]num=new int[2*n];
            for(int i=0;i<2*n;i++){
                num[i]=in.nextInt();
            }
            int[]ret=new int[2*n];
            ArrayList<Integer> list=new ArrayList<>();
            list=wash(num,n);
        }
    }
    public static ArrayList<Integer>  wash(int[]num,int n){
        int left=0;
        int right=n;
        int[]leftNum=new int[n];
        int[]rightNum=new int[n];
        int cur=0;
        while(right<num.length){
            leftNum[cur]=num[left];
            rightNum[cur]=num[right];
            left++;
            right++;
        }
        int[]ret=new int[2*n];
        ArrayList<Integer> list=new ArrayList<>();
        while(n!=0){
            list.add(rightNum[n-1]);
            list.add(leftNum[n-1]);
            n--;
        }
        return Collections.reverse(list);
    }
}
