import java.util.Scanner;
import java.util.Stack;

public class Test8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        boolean flag = false;
        if (m < 0) {//负数情况一定要考虑
            m = -m;
            flag = true;
        }
        Stack<Integer> stack = new Stack<>();
        while (m != 0) {
            int k1 = m / n;
            int k2 = m % n;
            stack.push(k2);
            m = k1;
        }
        if (flag) {
            System.out.print("-");
        }
        while (!stack.isEmpty()) {
            int x = stack.pop();
            if (x == 10) {
                System.out.print('A');
            } else if (x == 11) {
                System.out.print('B');
            } else if (x == 12) {
                System.out.print('C');
            } else if (x == 13) {
                System.out.print('D');
            } else if (x == 14) {
                System.out.print('E');
            } else if (x == 15) {
                System.out.print('F');
            } else {
                System.out.print(x);
            }

        }
    }
}
