import java.util.ArrayList;
import java.util.Scanner;

public class Demo68 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(i);
        }
        int cur=0;
        while(list.size()>1){
            cur=(cur+m-1)%list.size();
            list.remove(cur);
        }
        System.out.println(list.get(0));
    }
}
