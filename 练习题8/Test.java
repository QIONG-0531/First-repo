public class Test {
    //递归求 N 的阶乘
    public static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    // 递归求 1 + 2 + 3 + ... + 10
    public static int sum(int n) {
        if (n == 1) return 1;
        return n + sum(n - 1);
    }

    //按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4)
    public static void print(int n) {
        if (n > 9) {
            print(n / 10);
        }
        System.out.print(n % 10 + " ");
    }

    // 写一个递归方法，输入一个非负整数，返回组成它的数字之和.
    public static int printSum(int n) {
        if(n<10) return n;
        return printSum(n/10)+n%10;

    }

   // 求斐波那契数列的第 N 项
    public static int fib(int n){
        if(n==1 || n==2) return 1;
        return fib(n-1)+fib(n-2);
    }


    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(sum(5));
        print(1234);
        System.out.println();
        System.out.println(printSum(1234));
        System.out.println(fib(5));
    }
}
