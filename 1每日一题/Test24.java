import java.util.Scanner;

public class Test24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        int count=1;
        int cur=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='\"'){
                cur++;
                continue;
            }
            if(str.charAt(i)!=' ' || cur%2!=0){
                sb.append(str.charAt(i));
            }else if(str.charAt(i)==' ' && cur%2==0){
                sb.append("\n");
                count++;
            }
        }
        System.out.println(count);
        System.out.println(sb.toString());
    }
}
