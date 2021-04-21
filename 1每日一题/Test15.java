import java.util.Scanner;

public class Test15 {
    //末尾0的个数
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int count=0;
        for(int i=n;i>=5;i--){
            int tmp=i;
            while(tmp%5==0){
                count++;
                tmp=tmp/5;
            }
        }
        System.out.println(count);
    }
}
