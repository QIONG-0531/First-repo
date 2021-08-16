import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo62 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String a = in.nextLine();
            String b = in.nextLine();
            System.out.println(isOk(a,b));
        }
    }
    public static boolean isOk(String a,String b){
        List<Character> list = new ArrayList<>();
        for(char ch:a.toCharArray()){
            list.add(ch);
        }
        for(int i=0;i<b.length();i++){
            if(list.contains(b.charAt(i))){
                list.remove(list.indexOf(b.charAt(i)));
            }else{
                return false;
            }
        }
        return true;
    }
}
