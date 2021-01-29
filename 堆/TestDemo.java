import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        int []array={27,15,19,18,28,34,65,49,25,37};
        HeapDemo heap=new HeapDemo();
        heap.creatBigHeap(array);
        heap.display();
        heap.push(100);
        heap.display();
        heap.poll();
        heap.display();
        System.out.println(heap.peek());
    }
}
