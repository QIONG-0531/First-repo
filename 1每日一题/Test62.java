import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test62 {
    public static String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    public static String num="222333444555666777788899991234567890";
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            ArrayList<String> list=new ArrayList<>();
            int n=in.nextInt();
            for(int i=0;i<n;i++){
                String s=in.next();
                String ret="";
                s=s.replaceAll("-","");
                for(int j=0;j<7;j++){
                    ret+=num.charAt(str.indexOf(s.charAt(j)));
                }
                ret=ret.substring(0,3)+"-"+ret.substring(3,7);
                if(!list.contains(ret)){
                    list.add(ret);
                }
            }
            Collections.sort(list);
            for(int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }
            System.out.println();
        }
    }
}
