import java.util.Stack;
//逆波兰表达式
public class Test2 {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        int left=0;
        int right=0;
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                 right=stack.pop();
                 left=stack.pop();
                 stack.push(left+right);
            }
           else  if(tokens[i].equals("-")){
                right=stack.pop();
                left=stack.pop();
                stack.push(left-right);
            }
           else  if(tokens[i].equals("*")){
                right=stack.pop();
                left=stack.pop();
                stack.push(left*right);
            }
            else if(tokens[i].equals("/")){
                right=stack.pop();
                left=stack.pop();
                stack.push(left/right);
            }
            else{
                stack.push(Integer.valueOf(tokens[i]));
            }
        }
        return stack.pop();
    }
}
