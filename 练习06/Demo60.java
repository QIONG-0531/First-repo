import java.util.Comparator;
import java.util.PriorityQueue;

public class Demo60 {
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] ret=new int[k];
        if(k>arr.length|| k<=0 || arr==null || arr.length==0) return ret;
        //建大堆
        PriorityQueue<Integer> queue=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for(int i=0;i<arr.length;i++){
            if(i<k){
                queue.offer(arr[i]);
            }else{
                if(arr[i]<queue.peek()){
                    queue.poll();
                    queue.offer(arr[i]);
                }
            }
        }
        for(int i=0;i<k;i++){
            ret[i]=queue.poll();
        }
        return ret;


    }
}
