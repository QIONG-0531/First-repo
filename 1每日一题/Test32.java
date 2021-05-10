import java.util.Scanner;

public class Test32 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
                String str1 = in.nextLine();
                String str2 = in.nextLine();
                String max=str1.length()>str2.length() ? str1:str2;
                String min=str1.length()<str2.length() ? str1:str2;
                int flag=-1;
                for(int l=min.length();l>0;l--){
                    for(int i=0;i<min.length();i++){
                        int j=l+i-1;
                        if(j>=min.length()) break;
                        if(max.contains(min.substring(i,i+l))){
                            System.out.println(min.substring(i,i+l));
                            flag=1;
                            break;
                        }
                    }
                    if(flag==1)break;
                }
            }
        }
    }
