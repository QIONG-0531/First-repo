import java.util.Scanner;

public class Demo43 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int num=sc.nextInt();
            String ret=binary(num);
            int count=0;
            int maxCount=0;
            for(int i=0;i<ret.length();i++){
                if(ret.charAt(i)=='1'){
                    count++;
                    maxCount=Math.max(count,maxCount);
                }else{
                    count=0;
                }
            }
            System.out.println(maxCount);
        }
    }
    public static String binary(int num){
        StringBuilder sb=new StringBuilder();
        while(num!=0){
            sb.append(num%2);
            num=num/2;
        }
        sb.reverse();
        return sb.toString();
    }
}
