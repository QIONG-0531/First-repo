import java.util.Stack;

public class Demo49 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        int i=0;
        int j=0;
        Stack<Integer> stack=new Stack<>();
        while(i<pushA.length){
            if(pushA[i]!=popA[j]){
                stack.push(pushA[i]);
                i++;
            }else{
                i++;
                j++;
                while(!stack.isEmpty() && popA[j]==stack.peek()){
                    stack.pop();
                    j++;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
