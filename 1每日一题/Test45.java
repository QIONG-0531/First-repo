import java.util.Scanner;

public class Test45 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String str=in.nextLine();
            int n=0;
            for(int i=0;i<str.length();i++){
                n+=str.charAt(i)-'0';
            }
            System.out.println(String.valueOf(root(n)));
        }
    }
    public static int root(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n=n/10;
        }
        if(sum/10==0) return sum;
        return root(sum);

    }
}
