import java.util.Stack;

public class Testz20 {
    //最小栈
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> mins=new Stack<>();

    public void push(int node) {
        stack.push(node);
        if(mins.isEmpty()){
            mins.push(node);
        }
        else{
            if(node<=mins.peek()){
                mins.push(node);
            }
        }
    }

    public void pop() {
        int tmp=stack.pop();
        if(tmp==mins.peek()){
            mins.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return mins.peek();
    }
}

