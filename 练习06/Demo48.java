import java.util.Scanner;

public class Demo48 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = Integer.parseInt(sc.nextLine());
            String[] s = new String[n];
            for(int i = 0;i < n;i++){
                s[i] = sc.nextLine();
            }
            for(int i=0;i<n;i++){
                if(s[i].contains(",") || s[i].contains(" ")){
                    s[i] = "\"" + s[i] + "\"";
                }
            }
            for(int i = 0;i<n-1;i++){
                System.out.print(s[i]+", ");
            }
            System.out.println(s[n-1]);
        }
    }
}
