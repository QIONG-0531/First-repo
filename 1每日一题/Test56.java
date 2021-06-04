import java.util.ArrayList;
import java.util.Scanner;

public class Test56 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String str1=in.nextLine();
            String str2=in.nextLine();
            ArrayList<String> list=new ArrayList<>();
            int i=0;
            while(i<str1.length()){
                if(str1.charAt(i)=='\"'){
                    i++;
                    int begin=i;
                    while(i<str1.length()&&str1.charAt(i)!='\"'){
                        i++;
                    }
                    list.add(str1.substring(begin,i));
                    i+=2;
                }else{
                    int begin=i;
                    while(i<str1.length() && str1.charAt(i)!=','){
                        i++;
                    }
                    list.add(str1.substring(begin,i));
                    i++;
                }
            }
            boolean flag=true;
            for(int j=0;j<list.size();j++){
                if(str2.equals(list.get(j))){
                    System.out.println("Ignore");
                    flag=false;
                }
            }
            if(flag){
                System.out.println("Important!");
            }
        }
    }
}
