import javafx.scene.layout.Priority;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Test2 {
    //查找和最小的k对数字
        public  static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
            List<List<Integer>> list1=new ArrayList<>();
            if(nums1.length==0 || nums2.length==0){
                return list1;
            }
            PriorityQueue<List<Integer>> sp=new PriorityQueue<>(k,new Comparator<List<Integer>>() {
                @Override
                public int compare(List<Integer> o1, List<Integer> o2) {
                    return o2.get(0)+o2.get(1)-(o1.get(0)+o1.get(1));
                }
            });
            for(int i=0;i<nums1.length;i++){
                for(int j=0;j<nums2.length;j++){
                    if(sp.size()<k){
                        List<Integer> list=new ArrayList<>();
                        list.add(nums1[i]);
                        list.add(nums2[j]);
                        sp.offer(list);
                    }
                    else{
                        List<Integer> top=sp.peek();
                        if(nums1[i]+nums2[j] < top.get(0)+top.get(1)){
                            sp.poll();
                            List<Integer> list=new ArrayList<>();
                            list.add(nums1[i]);
                            list.add(nums2[j]);
                            sp.offer(list);
                        }else{
                            break;
                        }
                    }
                }
            }
            while(sp.size()>0){
                list1.add(sp.poll());
            }
            return list1;
        }
    public static void main(String[] args) {
        int[]nums1={1,1,2};
        int[]nums2={1,2,3};
        System.out.println(kSmallestPairs(nums1, nums2, 10));
    }
}
