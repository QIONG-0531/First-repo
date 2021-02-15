public class Test3 {
    //  求最大公约数
    public static int div(int a,int b){
        int c=a%b;
        while(c!=0){
            a=b;
            b=c;
            c=a%b;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(div(36, 12));
    }
}
