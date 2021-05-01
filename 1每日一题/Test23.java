import java.util.Scanner;

public class Test23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        for(int i=0;i<str.length();i++){
            StringBuilder sb=new StringBuilder();
            if(str.charAt(i)!=' '){
                sb.append(str.charAt(i));
            }
            else{
                System.out.println(sb.toString());
            }
        }
    }
}
