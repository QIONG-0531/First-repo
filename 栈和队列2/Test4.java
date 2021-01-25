import java.util.Scanner;

public class Test4 {
    //判断一个数是否是回文数
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int num=x;
        int ret=0;
        while(num!=0){
            ret=ret*10+num%10;
            num=num/10;
        }
        if(ret==x){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        //输出没有重复字母的字符串
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            String str=scanner.nextLine();
            StringBuilder builder=new StringBuilder();
            for(int i=0;i<str.length();i++){
                char temp=str.charAt(i);
                if (!builder.toString().contains(temp + "")) {
                    builder.append(temp);
                }
            }
            System.out.println(builder.toString());
        }

    }
}
