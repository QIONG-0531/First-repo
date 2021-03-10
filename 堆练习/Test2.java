import com.sun.deploy.ref.AppModel;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Test2 {
    //有序矩阵中第k小的元素
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer>heap=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(heap.size()<k){
                    heap.offer(matrix[i][j]);
                }
                else{
                    if(!heap.isEmpty()){
                        if(matrix[i][j]<heap.peek()){
                            heap.poll();
                            heap.offer(matrix[i][j]);
                        }
                    }
                }
            }
        }
        return heap.poll();
    }
}
