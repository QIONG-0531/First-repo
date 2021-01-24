import java.util.LinkedList;
import java.util.Queue;

/**
     * Created with IntelliJ IDEA.
     * Description:
     * User: GaoBo
     * Date: 2021-01-24
     * Time: 10:47
     */
    class  MyCircularQueue{
        private int front;
        private int rear;//代表当前可以存放数据元素的下标
        private int[] elem;

        public MyCircularQueue(int k) {
            this.elem = new int[k];
            this.front = 0;
            this.rear = 0;
        }

        /**
         * 入队
         * (rear+1)  % len
         * @param value
         * @return
         */
        public boolean enQueue(int value) {
            if(isFull()) {
                return false;
            }
            //放到数组的rear下标  rear往后走
            elem[rear]=value;
            rear=(rear+1)%elem.length;
            return  true;
        }

        /**
         * 队列是否为满
         * @return
         */
        public boolean isFull() {
            if((rear+1)%elem.length==front){
                return true;
            }
            return false;
        }

        /**
         * 出队
         * @return
         */
        public boolean deQueue() {
            if(isEmpty()) {
                return false;
            }
            //只需要挪动front这个下标就好了
            front=(front+1)%elem.length;
            return true;
        }

        /**
         * 队列是否为空
         * @return
         */
        public boolean isEmpty() {
            if(rear==front){
                return true;
            }
            return false;
        }

        /**
         * 得到队头元素
         * @return
         */
        public int Front() {
            if(isEmpty()){
                return -1;
            }
                return elem[front];
        }

        /**
         * 得到队尾元素
         * @return
         */
        public int Rear() {
            if(isEmpty()){
                return -1;
            }
            if(rear==0){
                return elem[elem.length-1];
            }
            return elem[rear-1];
        }
    }
    public class Test{
        public static void main(String[] args) {
            MyCircularQueue  myCircularQueue=new MyCircularQueue(10);
            Queue <Integer>queue=new LinkedList<>();
            queue.isEmpty();

        }
    }


