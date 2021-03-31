public class Test2 {
    //给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
    public int removeElement(int[] nums, int val) {
        /* if(nums==null || nums.length==0){
             return 0;
         }
         int i=0;//双指针，一个循环，一个代表不是该值的元素
         for(int j=0;j<nums.length;j++){
             if(nums[j]!=val){
                 nums[i++]=nums[j];//不相等时就跳过该元素
             }
         }
         return i;*/
        int i=0;
        int length=nums.length;
        while(i<length){
            if(nums[i]==val){
                nums[i]=nums[length-1];//相等，就和最后一个元素互换，然后丢弃，将长度变短
                length--;
            }else{
                i++;
            }
        }
        return length;
    }
//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
    public int searchInsert(int[] nums, int target) {
        if(target<nums[0]){
            return 0;
        }
        for(int i=0;i<nums.length-1;i++){
            if(target==nums[i]){
                return i;
            }
            if(target>nums[i] && target<=nums[i+1]){
                return i+1;
            }
        }
        if(target==nums[nums.length-1]){
            return nums.length-1;
        }else{
            return nums.length;
        }
    }
}
