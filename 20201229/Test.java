import java.util.Scanner;

public class Test {
    public static void main1(String[] args) {
        int a=11;
        String str="100";
        int num=Integer.parseInt(str);
        System.out.println(str);
        System.out.println(a<<1);
    }
//判断一个数字是奇数还是偶数
    public static void main2(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        if(num%2==0){
            System.out.println("num是偶数");
        }
        else{
            System.out.println("num是奇数");
        }
    }
//判断某一年是否是闰年
public static void main3(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int year=scanner.nextInt();
    if((year%4==0&&year%100!=0)||year%400==0){
        System.out.println("year是闰年");
    }
    else{
        System.out.println("year不是闰年");
    }
}
//计算1-100的和
    public static void main4(String[] args) {
        int n=1;
        int sum=0;
        while(n<=100){
            sum+=n;
            n++;
        }
        System.out.println(sum);
    }
//计算5的阶乘
    public static void main(String[] args) {
        int n=1;
        int ret=1;
        while(n<=5){
            ret*=n;
            n++;
        }
        System.out.println(ret);
    }
}
