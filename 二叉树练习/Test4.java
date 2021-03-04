import java.util.Stack;

class MinStack {
    //最小栈问题
    Stack<Integer> s=new Stack<>();
    Stack<Integer>mins=new Stack<>();
    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        s.push(x);
        if(mins.isEmpty()){
            mins.push(x);
        }
        else{
            if(x<=mins.peek()){
                mins.push(x);
            }
        }
    }

    public void pop() {
        int tmp=s.pop();
        if(tmp==mins.peek()){
            mins.pop();
        }
    }

    public int top() {
        return  s.peek();
    }

    public int getMin() {
        if(mins.isEmpty()){
            return 0;
        }
        return  mins.peek();
    }
}
public class Test4 {
}
