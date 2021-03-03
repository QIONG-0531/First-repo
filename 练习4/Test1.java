import java.util.HashSet;
import java.util.Scanner;

public class Test1 {
    //下厨房问题
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        HashSet<String> set=new HashSet<>();
        while(scan.hasNextLine()){
            String str=scan.nextLine();
            String[]strs=str.split(" ");
            for(String s:strs){
                set.add(s);
            }
        }
        System.out.println(set.size());
    }
}
