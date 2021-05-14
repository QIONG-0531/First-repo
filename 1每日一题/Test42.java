import java.util.ArrayList;
import java.util.Scanner;

public class Test42 {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            String str = in.nextLine();
            char[] ch = str.toCharArray();
            if (n <= 4) {
                pageSmall(ch, n);
            } else {
                pageLage(ch, n);
            }
        }
    }
    public static void pageSmall(char[]ch,int n){
        ArrayList<Integer> list=new ArrayList<>();
        int cur=1;
        for(int i=0;i<n;i++){
                list.add(i+1);
        }
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='U'){
                if(cur==1){
                        cur=n;
                    }else{
                        cur=cur-1;
                    }
                }else{
                    if(cur==n){
                        cur=1;
                    }else{
                        cur=cur+1;
                    }
                }
            }
        for(int i=0;i<list.size()-1;i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println(list.get(n-1));
        System.out.println(cur);
    }
    public static void pageLage(char[]ch,int n){
        int cur=1;
        int begin=1;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='U' && cur==1 && begin==1){
                begin=n-3;
                cur=n;
            }
            else if(ch[i]=='U' && cur==begin){
                begin=cur-1;
                cur=begin;
            }
            else if(ch[i]=='U'){
                cur--;
            }
            if(ch[i]=='D' && cur==n && begin==n-3){
                begin=1;
                cur=1;
            }
            else if(ch[i]=='D' && cur==begin+3){
                begin=begin+1;
                cur=begin+3;
            }
            else if(ch[i]=='D'){
                cur++;
            }
        }
        for(int i=0;i<3;i++){
            System.out.print((begin+i)+" ");
        }
        System.out.println(begin+3);
        System.out.println(cur);
    }
}
