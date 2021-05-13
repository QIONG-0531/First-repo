import java.util.HashMap;
import java.util.Scanner;

public class Test40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String str=in.nextLine();
            HashMap<Character,Integer> map=new HashMap<>();
            for(int i=0;i<str.length();i++){
                if(!map.containsKey(str.charAt(i))){
                    map.put(str.charAt(i),1);
                }else{
                    int count=1;
                    map.put(str.charAt(i),count+1);
                }
            }
            int flag=0;
            for(int i=0;i<str.length();i++){
                if(map.get(str.charAt(i))==1){
                    flag=-1;
                    System.out.println(str.charAt(i));
                    break;
                }
            }
            if(flag==0)System.out.println(-1);
        }
    }
}
