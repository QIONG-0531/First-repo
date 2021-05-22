import java.util.Scanner;

public class Test48 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String str=in.nextLine();
            char[]chars=str.toCharArray();
            for(int i=0;i<chars.length;i++){
                if(chars[i]==' '){
                    continue;
                }
                char tmp=(char)(chars[i]-5);
                if(tmp<'A'){
                    chars[i]=(char)('Z'-('A'-tmp)+1);
                }else{
                    chars[i]=tmp;
                }
            }
            System.out.println(new String(chars));
        }
    }
}
