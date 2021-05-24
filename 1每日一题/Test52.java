import java.util.Scanner;

public class Test52 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int n = in.nextInt();
            long ret=fib(n);
            String str=String.valueOf(ret);
            if(str.length()>6){
                str=str.substring(str.length()-6,str.length());
            }
            System.out.println(Integer.parseInt(str));
        }
    }
    public static long fib(int n){
       if(n==0 || n==1) return 1;
        long f0=1;
        long f1=1;
       for(int i=2;i<=n;i++){
           long f2=f0+f1;
           f0=f1;
           f1=f2;
       }
       return f1;
    }
}
