import java.util.Stack;

public class Test1 {
    //逆波兰表达式
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+") ||tokens[i].equals("-") || tokens[i].equals("*") ||tokens[i].equals("/")){
                int a=stack.pop();
                int b=stack.pop();
                if(tokens[i].equals("+")){
                    stack.push(b+a);
                }
                if(tokens[i].equals("-")){
                    stack.push(b-a);
                }
                if( tokens[i].equals("*")){
                    stack.push(b*a);
                }
                if(tokens[i].equals("/")){
                    stack.push(b/a);
                }
            }
            else{
                stack.push(Integer.valueOf(tokens[i]));
            }

        }
        return stack.peek();
    }
}
