import java.util.Scanner;
public class Test31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int n=in.nextInt();
            if(n==0) break;
            int sum=0;
            while(n>=3){
                sum+=n/3;
                n=n/3+n%3;
            }
            if(n==2){
                System.out.println(sum+1);
            }else{
                System.out.println(sum);
            }
        }
    }
}
