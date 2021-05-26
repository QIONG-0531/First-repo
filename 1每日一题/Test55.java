import java.util.Scanner;

public class Test55 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int n=Integer.parseInt(in.nextLine());
            String[]s=new String[n];
            for(int i=0;i<s.length;i++){
                s[i]=in.nextLine();
                if(s[i].contains(",") || s[i].contains(" ")){
                    s[i]="\""+s[i]+"\"";
                }
            }
            for (int i = 0; i < n; i ++ ) {
                if(i == n - 1) System.out.println(s[i]);
                else System.out.print(s[i] + ", ");
            }
        }
    }

}
