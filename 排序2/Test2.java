public class Test2 {
    //颜色分类
    public void sortColors(int[] nums) {
        if (nums.length < 2) return;
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int tmp = nums[i];
                nums[i] = nums[n];
                nums[n] = tmp;
                n++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                int tmp = nums[i];
                nums[i] = nums[n];
                nums[n] = tmp;
                n++;
            }
        }
    }
}
