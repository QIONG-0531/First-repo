import java.util.Stack;
//最小栈
class MinStack {
    Stack<Integer> s=new Stack<>();
    Stack<Integer> mins=new Stack<>();

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
        return s.peek();//和最小栈没有关系
    }

    public int getMin() {
        return mins.peek();
    }
}
public class Test1 {
}
