import java.util.HashSet;

public class Demo13 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //通过散列表来做，只要表的大小超过k，就删除最前面的值，在下标满足的范围里找值相等的情况
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])) return true;
            set.add(nums[i]);
            if(set.size()>k){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
}

