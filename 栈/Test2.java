import java.util.Stack;

public class Test2 {
    //检测出栈顺序是否正确
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack=new Stack<>();
        int i=0;
        int j=0;
        while(i<pushA.length){
            if(pushA[i]!=popA[j]){
                stack.push(pushA[i]);
                i++;
            }else{
                i++;
                j++;
                while(!stack.empty() && popA[j] == stack.peek()){
                    stack.pop();
                    j++;
                }
            }
        }
        return stack.empty();
    }
}
