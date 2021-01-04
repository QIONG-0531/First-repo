import java.util.Scanner;

public class Test {
    //递归求 N 的阶乘
    public static int fac1(int n){
        if(n==1){
            return 1;
        }
        return n*fac1(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(fac1(n));
    }
    //递归求 1 + 2 + 3 + ... + 10
    public static int sum3(int num){
        if(num==1){
            return 1;
        }
        return num+sum3(num-1);
    }
    public static void main11(String[] args) {
        System.out.println(sum3(10));
    }
    //按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归
    public static void print(int n){
        if(n>9){
          print(n/10);
        }
        System.out.println(n%10);
    }
    public static void main10(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        print(num);
    }
    //写一个递归方法，输入一个非负整数，返回组成它的数字之和
    public static int sumi(int n){
        if(n>9){
            return sumi(n/10)+n%10;
        }
        return n;
    }
    public static void main9(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        System.out.println(sumi(num));
    }
    //求斐波那契数列的第n项。(迭代实现
    public static void main8(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int ret=0;
        int first1=1;
        int first2=1;
        if(n==1||n==2){
            ret=1;
        }
        for(int i=3;i<=n;i++){
            ret=first1+first2;
            first1=first2;
            first2=ret;
        }
        System.out.println(ret);
    }
    //在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果
    public static int sum1(int a,int b){
        return a+b;
    }
    public static double sum1(double a,double b,double c){
        return a+b+c;
    }
    public static void main7(String[] args) {
        System.out.println(sum1(10, 20));
        System.out.println(sum1(1.2, 2.3, 3.3));
    }
    //在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
    public static int max(int a,int b){
        if(a>=b){
            return a;
        }
        return b;
    }
    public static double max(double a,double b){
        if(a>=b){
            return a;
        }
        return b;
    }
    public static void max(double a,double b,int c){
        double tmp1=a>b?a:b;
        double max=tmp1>c?tmp1:c;
        double tmp2=a<b?a:b;
        double min=tmp2<c?tmp2:c;
        double mid=a+b+c-max-min;
        System.out.println(max+">"+mid+">"+min);
    }
    public static void main6(String[] args) {
        System.out.println(max(10, 20));
        System.out.println(max(1.5, 2.4));
        max(1.2,3.4,5);
    }
    //创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
    //​ 要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
    public static int max2(int a,int b){
        if(a>=b){
            return a;
        }
        return b;
    }
    public static int max3(int a,int b,int c){
       return  max2(max2(a,b),max2(a,c));

    }
    public static void main5(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(max2(10, 20));
        System.out.println(max3(20, 90, 10));
    }
    //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序
    public static void main4(String[] args) {
        int[]arr={1,2,3,4,5};
        int tmp=0;
        int count=0;
        for(int i=0;i<5;i++){
            if((arr[i]%2)!=0){
              tmp=arr[i];
              arr[i]=arr[count];
              arr[count]=tmp;
              count++;
            }
        }
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
    }
    //求1！+2！+3！+4！+........+n!的和
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main3(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=0;
      for(int i=1;i<=n;i++){
          sum+=fact(i);
      }
        System.out.println(sum);
    }
    //递归求斐波那契数列的第 N 项
    public static int fac(int n){
        if(n==1||n==2){
            return 1;
        }
        return fac(n-1)+fac(n-2);
    }
    public static void main2(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(fac(n));
    }
    //有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
    public static  int find(int []arr){
        int count=0;
        for(int i=0;i < 5;i++){
            for(int j=0;j<5;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
               return i;
            }
        }
        return -1;
    }
    public static void main1(String[] args) {
        int[]arr=new int[]{11,22,22,33,33,44,44};
        int ret=find(arr);
        System.out.println(arr[ret]);
    }
}
