import java.util.Scanner;

public class Test39 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int n=in.nextInt();
            int a=in.nextInt();
            int[]b=new int[n];
            for(int i=0;i<n;i++){
                b[i]=in.nextInt();
            }
            for(int i=0;i<n;i++){
                if(b[i]<=a){
                    a=a+b[i];
                }else{
                    a=a+num(b[i],a);
                }
            }
            System.out.println(a);
        }
    }
    public static int num(int n1,int n2){
        int min=Math.min(n1,n2);
        for(int i=min;i>1;i--){
            if(n1%i==0 && n2%i==0){
                return i;
            }
        }
        return 1;
    }
}
