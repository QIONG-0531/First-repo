import java.util.HashMap;
import java.util.HashSet;

public class Test1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        int[]ret=new int[2];
        for(int i=0;i<nums.length;i++) {
            int x=nums[i];
            if(map.containsKey(target-x) && i!=map.get(target-x)) {
                  ret[0]=i;
                  ret[1]=map.get(target-x);
            }
        }
        return ret;
}
}
