import java.util.ArrayList;
import java.util.Scanner;

public class Demo47 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            ArrayList<Integer> list=new ArrayList<>();
            list=fenjie(n);
            System.out.print(n+" = ");
            for(int i=0;i<list.size()-1;i++){
                System.out.print(list.get(i)+" * ");
            }
            System.out.println(list.get(list.size()-1));
        }
    }
    public static ArrayList<Integer>  fenjie(int n){
        ArrayList<Integer> list=new ArrayList<>();
        if(sushu(n)){
            list.add(n);
            return list;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            while(n%i==0 && sushu(i)){
                list.add(i);
                n=n/i;
            }
        }
        if(n!=1){
            list.add(n);
        }
        return list;
    }
    public static boolean sushu(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
}
