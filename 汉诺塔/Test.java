import java.util.Scanner;

public class Test {
    //汉诺塔
    public static void move(char pos1,char pos2){
        System.out.print(pos1+"->"+pos2+" ");
    }//n盘子个数 pos1起始位置  pos2中途位置 pos3目的位置
    public static void hannuota(int n,char pos1,char pos2,char pos3){
        if(n==1){
            move(pos1,pos3);
            return;
        }
        hannuota(n-1,pos1,pos3,pos2);
        move(pos1,pos3);
        hannuota(n-1,pos2,pos1,pos3);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt() ;
        hannuota(n,'A','B','C');
    }
}

