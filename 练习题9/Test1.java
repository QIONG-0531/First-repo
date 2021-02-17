import java.util.Arrays;
//给你一个整数数组 nums ，你需要找出一个 连续子数组 ，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
public class Test1 {
    public static int findUnsortedSubarray1(int[] nums) {
        int[] numsCopy= Arrays.copyOf(nums,nums.length);
        Arrays.sort(numsCopy);
        int left=0;
        int right=0;
        for(int i=0;i<nums.length;i++){
            if(numsCopy[i]!=nums[i]){
                left=i;
                for(int j=nums.length-1;j>=0;j--){
                    if(numsCopy[j]!=nums[j]){
                         right=j;
                    }
                }
            }
        }
        if(left-right>0){
            return left-right+1;
        }
        return 0;
    }
    public static int findUnsortedSubarray2(int[] nums) {
        int right=0;
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<max){
                right=i;
            }
            else{
                max=nums[i];
            }
        }
        int min=nums[nums.length-1];
        int left=nums.length-1;
        for(int j=nums.length-2;j>=0;j--){
            if(nums[j]>min){
                left=j;
            }
            else{
                min=nums[j];
            }
        }
        if(right>left){
            return right-left+1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[]array={2,6,4,8,10,9,15};
        System.out.println(findUnsortedSubarray2(array));
    }
}
