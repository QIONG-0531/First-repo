import java.util.Scanner;

public class Test {
    //数一下 1到 100 的所有整数中出现多少个数字9
    public static void main1(String[] args) {
        int n = 1;
        int count = 0;
        while (n < 100) {
            if (n / 10 == 9) {
                count++;
            }
            if (n % 10 == 9) {
                count++;
            }
            n++;
        }
        System.out.println(count);
    }

    //输出 1000 - 2000 之间所有的闰年
    public static void main2(String[] args) {
        int n = 1000;
        for (n = 1000; n <= 2000; n++) {
            if ((n % 4 == 0 && n % 100 != 0) || n % 400 == 0) {
                System.out.println(n);
            }
        }
    }

    //打印 1 - 100 之间所有的素数
    public static void main3(String[] args) {
        int num = 1;
        while (num < 101) {
            int flag = 0;
            for (int n = 2; n < num; n++) {
                if (num % n == 0) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.println(num);
            }
            num++;
        }
    }

    //给定一个数字，判定一个数字是否是素数
    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int flag = 0;
        for (int n = 2; n < num; n++) {
            if (num % n == 0) {
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("num是素数");
        }
    }

    //根据输入的年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 18) {
            System.out.println("少年");
        } else if (age <= 28) {
            System.out.println("青年");
        } else if (age <= 55) {
            System.out.println("中年");
        } else {
            System.out.println("老年");
        }
    }
   

