import java.util.Scanner;

public class Test26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1=in.nextLine();
        String str2=in.nextLine();
        System.out.println(AddLongInteger(str1,str2));
    }
    public static String AddLongInteger(String addend,String augend){
        int add=0;
        StringBuffer sb=new StringBuffer();
        String max=addend.length()>augend.length()?addend:augend;
        String min=addend.length()<augend.length()?addend:augend;
        int j=min.length()-1;
        for(int i=max.length()-1;i>=0;i--){
            if(j>=0){
                int x=(min.charAt(j)-'0')+(max.charAt(i)-'0')+add;
                if(x>9){
                    add=1;
                    sb.append(x-10);
                }else{
                    add=0;
                    sb.append(x);
                }
            }else{
                if(add==1){
                    int x=(max.charAt(i)-'0')+add;
                    if(x>9){
                        add=1;
                        sb.append(x-10);
                    }else{
                        add=0;
                        sb.append(x);
                    }
                }else {
                    sb.append(max.charAt(i));
                }
            }
            j--;
        }
        if(add==1){
            sb.append(1);
        }
        return sb.reverse().toString();
    }
}

