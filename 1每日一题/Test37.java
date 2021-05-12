import java.util.Scanner;

public class Test37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String str1=in.nextLine();
            String str2=in.nextLine();
            boolean flag=isOk(str1,str2);
            System.out.println(flag);
        }
    }
    public static boolean isOk(String str1,String str2){
        int cur=0;
        for(int i=0;i<str2.length();i++){
            if(str1.charAt(i)!='*'  && str1.charAt(i)!='?' && str1.charAt(cur)!=str2.charAt(i)){
                return false;
            }

            if(str1.charAt(cur)=='?' || str1.charAt(cur)==str2.charAt(i)){
                cur++;
                continue;
            }
            //当前情况一定是为*
            if((cur+1)<str1.length() && (i+1)<str2.length()){
                if(str1.charAt(cur+1)==str2.charAt(i+1)  || str1.charAt(cur+1)=='?'){
                    cur++;
                    continue;
                }
            }
            //不相等就向后循环
            if(str1.charAt(cur)=='*'){
                continue;
            }
        }
        return true;
    }

}

