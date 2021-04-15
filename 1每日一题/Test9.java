import java.util.ArrayList;
import java.util.Scanner;

public class Test9 {
    //统计回文
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String strA=in.nextLine();
        String strB=in.nextLine();
        int count=0;
        for(int i=0;i<=strA.length();i++){
            String str=strA.substring(0,i)+strB+strA.substring(i,strA.length());
            if(isHui(str)){
                count++;
            }
        }
        System.out.print(count);
    }
    public static boolean isHui(String str){
        char[]chars=str.toCharArray();
        int left=0;
        int right=chars.length-1;
        while(left<right){
            if(chars[left]!=chars[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}
