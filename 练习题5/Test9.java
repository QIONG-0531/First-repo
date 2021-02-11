import java.util.Arrays;
import java.util.HashMap;

public class Test9 {
    //给定一个整数数组 nums 和一个整数目标值 target，
    // 请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
    public static int[] twoSum(int[] nums, int target) {
        /*int[]find=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    find[0]=i;
                    find[1]=j;
                    return find;
                }
            }
        }
        return null;*/
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[]nums={3,2,4};
        int target=6;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
}
