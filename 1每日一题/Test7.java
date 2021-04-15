import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[]num=new int[4];
        for(int i=0;i<4;i++){
            num[i]=in.nextInt();
        }
        int A=(num[0]+num[2])/2;
        int B=(num[1]+num[3])/2;
        int C=num[3]-B;
        if((num[0]+num[2])%2==0 && (num[1]+num[3])%2==0 && (A+B)==num[2]){
            System.out.print(A+" "+B+" "+C);
        }
        else{
            System.out.print("No");
        }
    }
}
