import java.util.Scanner;

public class Test29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String str1=in.nextLine();
            String str2=in.nextLine();
            System.out.println(isOk(str1,str2));
        }
    }
    public static boolean isOk(String str1,String str2){
        int i=0;
        int j=0;
        while(j<str2.length() && i<str1.length()) {
            if (str2.charAt(j) == str1.charAt(i)) {
                i++;
                j++;
            } else if (str1.charAt(i) == '?') {
                i++;
                j++;
            } else if (str1.charAt(i) == '*') {
                while (i < str1.length() && str1.charAt(i) == '*') {
                    i++;
                }
                if(i<str1.length()){
                    char tmp=str1.charAt(i);
                    while(j<str2.length() && tmp!=str2.charAt(j)){
                        j++;
                    }
                    if(j>=str2.length()){
                        return false;
                    }
                }else{
                    return true;
                }
            }
        }
        if(i>=str1.length() && j>=str2.length()){
            return true;
        }
        return false;
    }
}
