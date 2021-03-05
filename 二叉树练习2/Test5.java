import java.util.Stack;
//用栈实现队列
class Solution1 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack1.isEmpty()&& stack2.isEmpty()){
            return -1;
        }
        if(stack2.isEmpty()){
            while(stack1.size()!=0){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
public class Test5 {

}
