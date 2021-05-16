import java.util.Scanner;

public class Test43 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        String str1=in.nextLine();
        String str2=in.nextLine();
        String min=str1.length()<str2.length()?str1:str2;
        String max=str1.length()>str2.length()?str1:str2;
        int j=0;
        for(int l=min.length();l>0;l--){
            for(int i=0;i<min.length();i++){
                j=i+l-1;
                if(j>=min.length()) break;
                if(max.contains(min.substring(i,i+l))){
                    System.out.println(l);
                    return;
                }
            }
        }
        System.out.println(0);
    }
}
