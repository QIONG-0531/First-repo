import java.util.Scanner;

public class Test49 {
    public static void main(String[] args) {
        //质数因子的个数
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int n=in.nextInt();
            if(isSu(n)){
                System.out.println(1);
                continue;
            }
            int count=0;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0) {
                    while(n%i==0){
                        n/=i;
                    }
                    count++;
                }
            }
            if(n!=1) count++;
            System.out.println(count);
        }
    }
    public static boolean isSu(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0) return false;
        }
        return true;
    }
}
