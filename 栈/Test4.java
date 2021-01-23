import java.util.Stack;

public class Test4 {
    public int calPoints(String[] ops) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<ops.length;i++){
            if(ops[i].equals("+")){
                int a=stack.peek();
                int c=stack.pop();
                int b=stack.peek();
                stack.push(c);
                stack.push(a+b);
                continue;
            }
            if(ops[i].equals("C")){
                stack.pop();
                continue;
            }
            if(ops[i].equals("D")){
                int num=stack.peek();
                stack.push(num*2);
                continue;
            }
            stack.push(Integer.valueOf(ops[i]));

        }
        int ret=0;
        while(!stack.empty()){
            ret=ret+stack.pop();
        }
        return ret;

    }
}
