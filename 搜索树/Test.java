import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//给定一个排序好的数组 arr ，两个整数 k 和 x ，从数组中找到最靠近 x（两数之差最小）的 k 个数。
// 返回的结果必须要是按升序排好的。
class Num{
    int x;
    int abs;
}
public class Test {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        if(arr.length==0) return null;
        Num[]nums=new Num[arr.length];
        for(int i=0;i<nums.length;i++){
            Num num=new Num();
            num.x=arr[i];
            num.abs=Math.abs(num.x-x);
            nums[i]=num;
        }
        Arrays.sort(nums, new Comparator<Num>() {
            @Override
            public int compare(Num o1, Num o2) {
                return o1.abs-o2.abs;
            }
        });

        List<Integer> list=new ArrayList<>();
        for(int i=0;i<k;i++){
            int ret=nums[i].x;
            list.add(ret);
        }
        list.sort(Comparator.naturalOrder());
           return list;
    }

    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5};
       int k = 4;
       int x = 3;
        System.out.println(findClosestElements(arr, k, x));
    }
}
