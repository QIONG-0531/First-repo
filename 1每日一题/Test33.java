import java.util.Scanner;

public class Test33 {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int count = 0;
            while (n != 0) {
                int tmp = n % 2;
                if (tmp == 1) count++;
                n = n / 2;
            }
            System.out.println(count);
        }
    }
}

