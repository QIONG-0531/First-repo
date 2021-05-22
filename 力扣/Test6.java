import java.util.Stack;

public class Test6 {
    public boolean isValid(String s) {
        Stack<Character> stack =new Stack<>();
        char[]chars=s.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(chars[i]=='(' || chars[i]=='{' || chars[i]=='['){
                stack.push(chars[i]);
            }else{
                if(stack.isEmpty()){
                    return false;
                }else if((stack.peek()=='('&& chars[i]==')') || (stack.peek()=='{'&&chars[i]=='}')
                        || (stack.peek()=='['&&chars[i]==']')){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
    public boolean isValid1(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(') stack.push(')');
            else if(ch=='{')stack.push('}');
           else if(ch=='[') stack.push(']');
            else if(stack.isEmpty() || ch!=stack.pop()) return false;
        }
         return stack.isEmpty();
    }
}
