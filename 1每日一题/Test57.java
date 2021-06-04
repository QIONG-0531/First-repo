import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Test57 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int n=in.nextInt();
            int max=0;
            ArrayList<String> list=new ArrayList<>();
            for(int i=0;i<n;i++){
                String id=in.next();
                String sta=in.next();
                if(sta.equals("connect")){
                    list.add(id);
                }else{
                    list.remove(id);
                }
                max=Math.max(max,list.size());
            }
            System.out.println(max);
        }
    }
}
