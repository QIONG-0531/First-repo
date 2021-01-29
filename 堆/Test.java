import java.util.PriorityQueue;

public class Test {
    //最后一块石头的重量
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap=new PriorityQueue<>((x, y) -> y - x);
        for(int i=0;i<stones.length;i++){
            heap.offer(stones[i]);
        }
        while(heap.size()>1){
            int x=heap.poll();
            int y=heap.poll();
            if(x!=y){
                heap.offer(x-y);
            }
        }
        if(heap.size()==1){
            return heap.poll();
        }
        return 0;

    }
}
