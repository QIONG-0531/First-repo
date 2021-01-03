import java.util.Random;
import java.util.Scanner;

public class Test {
    //输出n*n的乘法口诀表，n由用户输入
    public static void main12(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+" ");
            }
            System.out.println();
        }
    }
    //输出一个整数的每一位，如：123的每一位是1 ， 2 ， 3
    public static void main11(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        while(num!=0){
            System.out.print(num%10+" ");
            num=num/10;
        }
    }
    //编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输 入，最多输入三次。三次均错，则提示退出程序
    public static void main10(String[] args) {
        int time=3;
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextLine()){
           String passWord=scanner.nextLine();
            if(passWord.equals("12345")){
                System.out.println("登录成功");
            }
            else{
                time--;
                System.out.println("密码错误");
            }
            if(time<=0){
                System.out.println("登录失败");
            }
        }
    }
    //获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
    public static void main9(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        System.out.println("偶数序列");
        for(int i=31;i>=0;i=i-2){
            System.out.print((num>>i)&1);
        }
        System.out.println();
        System.out.println("奇数序列");
        for(int i=30;i>=0;i=i-2){
            System.out.print((num>>i)&1);
        }
    }
    //求一个整数，在内存当中存储时，二进制1的个数
    public static void main8(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int x=1;
        int count=0;
        while(x!=0){
            if((num&x)!=0){
                count++;
            }
            x=x<<1;
        }
        System.out.println(count);
    }
    public static void main7(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int count=0;
        while(num!=0){
            if((num&1)==1){
                count++;
            }
            num=num>>1;
        }
        System.out.println(count);
    }
    //求两个正整数的最大公约数(辗转相除法）
    public static void main6(String[] args) {
        int x=12;
        int y=20;
        int n=0;
        while ((x%y)!=0){
            n=x%y;
            x=y;
            y=n;
        }
        System.out.println(n);
    }
    //打印 X 图形
    public static void main5(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextInt()){
            int n=scanner.nextInt();
            char[][] arr = new char[n][n];
            for(int i=0;i<n;i++) {//将数组初始化为空格
                for (int j = 0; j < n; j++) {
                    arr[i][j] =' ';
                }
            }
            for(int i=0;i<n;i++){//将两条边设为*
                int left=i;
                int right=n-i-1;
                arr[i][i]='*';
                arr[left][right]='*';
            }
            for(int i=0;i<n;i++){//打印数组
                for(int j=0;j<n;j++){
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
    }
    //完成猜数字游戏 ，用户输入数字，判断该数字是大于，小于，还是等于随机生成的数字，等于的时候退出程序。
    public static void main4(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int randNum=random.nextInt(100);//生成一个随机数【0，100）
        while (scanner.hasNextInt()){
            int num=scanner.nextInt();
            if(num>randNum){
                System.out.println("大");
            }
            if(num<randNum){
                System.out.println("小");
            }
            if(num==randNum){
                System.out.println("相等");
                break;
            }
        }
    }
    //求出0～999之间的所有“水仙花数”并输出。(如；153＝1＋5＋3?，则153是一个“水仙花数“。）
    public static void main3(String[] args) {
        for(int num=1;num<1000;num++){
            int count=0;
            int tmp=num;
            while(tmp!=0){
                count++;
                tmp=tmp/10;
            }
            tmp=num;
            double sum=0;
            while(tmp!=0){
                sum=sum+Math.pow(tmp%10,count);
                tmp=tmp/10;
            }
            if(sum==num){
                System.out.println(num);
            }
        }
    }
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//999999
        for (int i = 1; i <= n ; i++) {
            int count = 0;//每个数字有几位数
            int tmp = i ;
            while (tmp != 0) {
                count++;
                tmp = tmp/10;
            }
            //count
            tmp = i;
            int sum = 0;
            while (tmp != 0) {
                sum += Math.pow(tmp%10,count);
                tmp = tmp/10;
            }
            if(sum == i) {
                System.out.println(i);
            }
        }
    }
    //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
    public static void main1(String[] args) {
        double sum=0.0;
        int i=1;
        for(int n=1;n<100;n++){
            sum=sum+1.0/n*i;
            i=-i;
        }
        System.out.println(sum);
    }
}

