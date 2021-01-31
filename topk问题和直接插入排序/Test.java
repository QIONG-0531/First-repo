import java.util.Comparator;
import java.util.PriorityQueue;

public class Test {
    //找前k个最小的数，建大小为k的大堆
    public static void topK2(int[]array,int k){
        PriorityQueue<Integer>heap=new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for(int i=0;i<array.length;i++){
            if(heap.size()<k){
                heap.offer(array[i]);
            }
            else {
                if (heap != null) {
                    if (array[i] <heap.peek()) {
                        heap.poll();
                        heap.offer(array[i]);
                    }
                }
            }
        }
        for(int i=0;i<k;i++){
            System.out.println(heap.poll());
        }
    }
    //找前k个最大的数，建大小为k的小堆
    public static void topK(int[]array,int k){
        PriorityQueue<Integer>heap=new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        for(int i=0;i<array.length;i++){
            if(heap.size()<k){
                heap.offer(array[i]);
            }
            else {
                if (heap != null) {
                    if (array[i] > heap.peek()) {
                        heap.poll();
                        heap.offer(array[i]);
                    }
                }
            }
        }
        for(int i=0;i<k;i++){
            System.out.println(heap.poll());
        }
    }

    public static void main(String[] args) {
        int[]array={23,12,45,34,65,47};
        topK(array,3);
        System.out.println();
        topK2(array,3);
    }
    public static void main1(String[] args) {
        //用比较器将小堆转换为大堆
        PriorityQueue<Integer> heap=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        heap.offer(10);
        heap.offer(5);
        heap.offer(9);
        System.out.println(heap.poll());
        System.out.println(heap.poll());
        System.out.println(heap.poll());
    }
}
