public class Test {
    //给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串 ransom 能不能由第二个字符串 magazines 里面的字符构成。
    // 如果可以构成，返回 true ；否则返回 false。
    public static  boolean canConstruct(String ransomNote, String magazine) {
        char[] chars1 = ransomNote.toCharArray();
        char[] chars2 = magazine.toCharArray();
        for (char c : chars1) {
            boolean flag = false;
            for (int j = 0; j < chars2.length; j++) {
                if (c == chars2[j]) {
                    chars2[j] = ' ';
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String ransomNote="aa";
        String magazine="aac";
        System.out.println(canConstruct(ransomNote, magazine));
    }
    //给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
    public static int searchInsert2(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }
    public  static  int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        if(target<nums[0]){
            return 0;
        }
        if(target>nums[nums.length-1]){
            return nums.length;
        }
        for(int i=0;i<nums.length-1;i++){
            if(target>nums[i] && target<nums[i+1]){
                return i+1;
            }
        }
        return -1;
    }

}
