import java.util.ArrayList;
import java.util.Scanner;

public class Test50 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            ArrayList<Integer> ret=new ArrayList<>();
            ret=List(a);
            System.out.print(a+" = "+ret.get(0));
            for(int i=1;i<ret.size();i++){
                System.out.print(" * "+ret.get(i));
            }
            System.out.println();
        }
    }
    public static ArrayList<Integer> List(int n){
        ArrayList<Integer>list=new ArrayList<>();
        if(isSu(n)){
            list.add(n);
            return list;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0 && isSu(i)){
                while(n%i==0){
                    list.add(i);
                    n=n/i;
                }
            }
        }
        if(n!=1)list.add(n);
        return list;
    }
    public static boolean isSu(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
