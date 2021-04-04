public class Testz30 {
    //连续子数组的最大和（动态规划）
    public int FindGreatestSumOfSubArray(int[] array) {
        int max=array[0];
        for(int i=1;i<array.length;i++){
            //代表截至当前元素的连续子序列的最大和
            //如果前一个元素大于0，加上后当前值一定变大
            //如果小于0，一定变小，所以不加
            array[i]+=array[i-1]>0?array[i-1]:0;
            max=Math.max(max,array[i]);
        }
        return max;
    }
}
