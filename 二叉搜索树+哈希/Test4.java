import java.util.HashSet;
//给定两个数组，编写一个函数来计算它们的交集。
public class Test4 {
        public int[] intersection(int[] nums1, int[] nums2) {
            HashSet<Integer> set1=new HashSet<>();
            HashSet<Integer> set2=new HashSet<>();
            for(int x:nums1){
                set1.add(x);
            }
            for(int x:nums2){
                if(set1.contains(x)){
                    set2.add(x);
                }
            }
            int[]num=new int[set2.size()];
            int i=0;
            for(int x:set2){
                num[i++]=x;
            }
            return num;
        }
    }
