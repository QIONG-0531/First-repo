import java.util.HashSet;
import java.util.Scanner;

public class Test2 {
    //输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。
    // 例如，输入”They are students.”和”aeiou”，则删除之后的第一个字符串变成”Thy r stdnts.”
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        String str1=in.nextLine();
        String str2=in.nextLine();
        HashSet<Character> set=new HashSet<>();
        for(char ch:str2.toCharArray()){
            set.add(ch);
        }
        for(int i=0;i<str1.length();i++){
            if(!set.contains(str1.charAt(i))){
                System.out.print(str1.charAt(i));
            }
        }
    }
}
