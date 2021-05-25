import java.util.Scanner;

public class Test54 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String s=in.next();
            String t=in.next();
            int start=0;
            int count=0;
            while (start<s.length()){
                int i=start;
                int j=0;
                while(j<t.length() && s.charAt(i)==t.charAt(j)){
                    i++;
                    j++;
                }
                if(j==t.length() && start+t.length()<=s.length()){
                    count++;
                    start+=t.length();
                }else if(j!=t.length()){
                    start++;
                }else{
                    break;
                }
            }
            System.out.println(count);
        }
    }
}
