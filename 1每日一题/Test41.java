import java.util.ArrayList;
import java.util.Scanner;

public class Test41 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String str1=in.nextLine();
            String str2=in.nextLine();
            int len1=calStringDistance(str1,str2);
            int len2=calStringDistance(str2,str1);
            int min=len1<len2 ? len1:len2;
            System.out.println(min);
        }
    }
    public static int calStringDistance(String charA,String charB){
        int count=0;
        ArrayList<Character> A=new ArrayList<>();
        for(char ch:charA.toCharArray()){
            A.add(ch);
        }
        ArrayList<Character> B=new ArrayList<>();
        for(char ch:charB.toCharArray()){
            B.add(ch);
        }
        int j=0;
        for(int i=0;i<B.size();i++){
            if(j<A.size()){
                if(B.get(i)==A.get(i)){
                    j++;
                    continue;
                }else{
                    if(B.get(i)==A.get(j+1)){
                        A.remove(j);
                        count++;
                    }else  if(B.get(i+1)==A.get(j)){
                        A.add(j,B.get(i));
                        count++;
                    }else{
                        j++;
                        count++;
                    }
                }
            }else{
                count++;
            }
        }
        while(j<A.size()){
            j++;
            count++;
        }
        return count;
    }
}
