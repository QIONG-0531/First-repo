public class Test5 {
    //给你一个整数数组 nums，请编写一个能够返回数组 “中心索引” 的方法。
    //
    //数组 中心索引 是数组的一个索引，其左侧所有元素相加的和等于右侧所有元素相加的和。
    //
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count*2+nums[i]==sum){
                return i;
            }
            count+=nums[i];
        }
        return -1;
    }
}
