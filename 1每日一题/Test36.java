import java.util.Scanner;

public class Test36 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String str1=in.nextLine();
            String str2=in.nextLine();
            String max=str1.length()>str2.length()?str1:str2;
            String min=str1.length()<str2.length()?str1:str2;
            int size=0;
            boolean flag=false;
            for(int l=min.length();l>0;l--){
                for(int i=0;i<min.length();i++){
                    int j=i+l;
                    if(j>=min.length()) break;
                    if(max.contains(min.substring(i,j))){
                        size=l;
                        flag=true;
                        break;
                    }
                }
                if(flag==true) break;
            }
            System.out.println(size);
        }
    }
}
