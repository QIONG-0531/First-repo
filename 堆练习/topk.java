import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class topk {
    //找前k个最大的（建大小为k的小堆）
        public static void  topk1(int[] array, int k){
            PriorityQueue<Integer> heap = new PriorityQueue<>();
            for(int i=0;i<array.length;i++){
                if(heap.size()<k){
                    heap.offer(array[i]);
                }
                else{
                    if(!heap.isEmpty()){
                        if(heap.peek()<array[i]){
                            heap.poll();
                            heap.offer(array[i]);
                        }
                    }
                }
            }
            while(heap.size()!=0){
                System.out.print(heap.poll()+" ");
            }
        }
        //前k个最小的数
       public static void topk2(int[]array,int k) {
           PriorityQueue<Integer> heap = new PriorityQueue<>(new Comparator<Integer>() {
               @Override
               public int compare(Integer o1, Integer o2) {
                   return o2 - o1;//大堆
               }
           });
            for(int i=0;i<array.length;i++){
                if(heap.size()<k){
                    heap.offer(array[i]);
                }
                else{
                    if(!heap.isEmpty()){
                        if(heap.peek()>array[i]){
                            heap.poll();
                            heap.offer(array[i]);
                        }
                    }
                }
            }
            while(!heap.isEmpty()){
                System.out.print(heap.poll()+" ");
            }
       }
    //查找和最小的K对数字
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
       PriorityQueue<List<Integer>> heap=new PriorityQueue<>(new Comparator<List<Integer>>() {
           @Override
           public int compare(List<Integer> o1, List<Integer> o2) {
               return (o2.get(0)+o2.get(1))-(o1.get(0)+o1.get(1));
           }
       });
       List<List<Integer>> ret=new ArrayList<>();
       for(int i=0;i<nums1.length;i++){
           for(int j=0;j<nums2.length;j++){
               if(heap.size()<k) {
                   List<Integer> list = new ArrayList<>();
                   list.add(nums1[i]);
                   list.add(nums2[j]);
                   heap.offer(list);
               }else{
                   if(!heap.isEmpty()){
                       if((nums1[i]+nums2[j])<(heap.peek().get(0)+heap.peek().get(1))){
                           heap.poll();
                           List<Integer> list = new ArrayList<>();
                           list.add(nums1[i]);
                           list.add(nums2[j]);
                           heap.offer(list);
                       }
                   }
               }
           }
       }
       while(!heap.isEmpty()){
           ret.add(heap.poll());
       }
       return ret;
    }
    public static void main(String[] args) {
        int[]array={3,2,4,7,8,5,9};
        topk1(array,4);
        System.out.println();
        topk2(array,3);
    }
    }

