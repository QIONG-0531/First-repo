import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
//用队列实现栈
class MyStack {
    Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();

    /** Initialize your data structure here. */
    public MyStack() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        if(!q1.isEmpty()){
            q1.offer(x);
        }
        else if(!q2.isEmpty()){
            q2.offer(x);
        }
        else{
            q1.offer(x);
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(empty()){
            return -1;
        }
        if(!q1.isEmpty()){
            while((q1.size()-1)!=0){
                q2.offer(q1.poll());
            }
            return q1.poll();
        }
        else{
            while((q2.size()-1)!=0){
                q1.offer(q2.poll());
            }
            return q2.poll();
        }
    }

    /** Get the top element. */
    public int top() {
        if(empty()){
            return -1;
        }
        if(!q1.isEmpty()){
            while((q1.size()-1)!=0){
                q2.offer(q1.poll());
            }
            int tmp=q1.poll();
            q2.offer(tmp);
            return  tmp;
        }
        else{
            while((q2.size()-1)!=0){
                q1.offer(q2.poll());
            }
            int tmp=q2.poll();
            q1.offer(tmp);
            return  tmp;
        }
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty()  && q2.isEmpty();
    }
}
public class TestDemo {

    }



