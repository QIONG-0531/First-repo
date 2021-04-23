import java.util.Scanner;
import java.util.Stack;

public class Test20 {
    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
            int num=in.nextInt();
            int count=0;
            int max=0;
            Stack<Integer>stack=new Stack<>();
            while(num!=0){
                stack.push(num%2);
                num=num/2;
            }
            while(!stack.isEmpty()){
                int x=stack.pop();
                if(x==1){
                    count++;
                    max=Math.max(count,max);
                }else if(x==0){
                    count=0;
                }
            }
            System.out.println(max);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
            int num=in.nextInt();
            int count=0;
           String str=Integer.toBinaryString(num);
           String[]s=str.split("0+");
           int max=s[0].length();
           for(int i=1;i<s.length;i++){
               if(s[i].length()>max){
                   max=s[i].length();
               }
           }
            System.out.println(max);
        }
    }
}

