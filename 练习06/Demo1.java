import java.util.Scanner;
import java.util.Stack;

public class Demo1 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int n=in.nextInt();
            Stack<String> stack=new Stack<>();
            int ret=0;
            for(int i=0;i<n;i++){
                String s=in.next();
                if(s.equals("+")){
                    int right=Integer.valueOf(stack.pop());
                    int left=Integer.valueOf(stack.pop());
                    ret=left+right;
                    stack.push(String.valueOf(ret));
                }else if(s.equals("-")){
                    int right=Integer.valueOf(stack.pop());
                    int left=Integer.valueOf(stack.pop());
                    ret=left-right;
                    stack.push(String.valueOf(ret));
                }else  if(s.equals("*")){
                    int right=Integer.valueOf(stack.pop());
                    int left=Integer.valueOf(stack.pop());
                    ret=left*right;
                    stack.push(String.valueOf(ret));
                }else  if(s.equals("/")){
                    int right=Integer.valueOf(stack.pop());
                    int left=Integer.valueOf(stack.pop());
                    ret=left/right;
                    stack.push(String.valueOf(ret));
                }else{
                    stack.push(s);
                }
            }
            System.out.println(Integer.valueOf(stack.pop()));
        }

    }
}
