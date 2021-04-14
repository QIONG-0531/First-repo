import java.util.Scanner;

public class Test4 {
    //倒置字符串
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        String[]strs=str.split(" ");
        for(int i=strs.length-1;i>=1;i--){
            if(strs[i]!=" "){
                System.out.print(strs[i]+" ");
            }
        }
        System.out.print(strs[0]);
    }
}
