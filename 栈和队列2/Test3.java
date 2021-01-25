//循环队列
class MyCircularQueue {
    public int front;
    public int rear;
    public int[]elem;

    public MyCircularQueue(int k) {
        elem=new int[k+1];
    }

    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        elem[rear]=value;
        rear=(rear+1)%elem.length;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        front=(front+1)%elem.length;
        return true;
    }

    public int Front() {
        if(isEmpty()){
            return -1;
        }
        else{
            return elem[front];
        }
    }

    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        if(rear==0){
            return elem[elem.length-1];
        }else{
            return elem[rear-1];
        }
    }

    public boolean isEmpty() {
        return front==rear;
    }

    public boolean isFull() {
        return (rear+1)%elem.length==front;
    }
}
public class Test3 {
}
