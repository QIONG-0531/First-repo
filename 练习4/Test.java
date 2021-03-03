import java.util.Stack;

public class Test {
    //给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        char[]chars=s.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(chars[i]=='(' || chars[i]=='[' || chars[i]=='{'){
                stack.push(chars[i]);
            }
            else{if(stack.isEmpty()){
                return false;
            }
            else if((stack.peek()=='(' && chars[i]==')') ||(stack.peek()=='[' && chars[i]==']') ||  (stack.peek()=='{' && chars[i]=='}') ){
                stack.pop();
            }
            else return false;
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
