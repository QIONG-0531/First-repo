import java.util.*;
public class Test21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int num=in.nextInt();
            int left=num/2;
            int right=num/2;
            while(left>=1 && right<num){
                if(sushu(left)&& sushu(right)){
                    System.out.println(left);
                    System.out.println(right);
                    break;
                }
                if(!sushu(left) || !sushu(right)){
                    left--;
                    right++;
                }
            }
        }
    }
    public static boolean sushu(int num){
        boolean flag=true;
        for(int j=2;j<=Math.sqrt(num);j++){
            if(num%j==0){
                flag=false;
                break;
            }
        }
        return flag;
    }
    }
