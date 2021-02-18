import java.util.ArrayList;
import java.util.List;
//给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）
public class Test {
    public static List<List<Integer>> subsets(int[] nums) {
        List<Integer> temp=new ArrayList<>();
        dfs(nums,temp,0);
        res.add(new ArrayList<>());
        return res;
    }
    public static List<List<Integer>> res=new ArrayList<>();
    public static void dfs(int []nums,List<Integer> temp,int len){
        for(int i=len;i<nums.length;i++){
            temp.add(nums[i]);
            res.add(new ArrayList<>(temp));
            dfs(nums,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
    public static List<List<Integer>> subsets2(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        //n代表有多少种排序，例如[1,2,3]，结果会有8重排序
        int n = (int)Math.pow(2, nums.length);
        for (int i=0; i<n; i++){
            List<Integer> t = new ArrayList<>();
            //index代表数的第几位
            int index = 0;
            int k = i;
            while (k != 0){
                //如果当前位为1，则把当前index位数的值拿出来
                if ((k & 1) == 1)t.add(nums[index]);
                k = k >> 1;
                index++;
            }
            res.add(t);
        }
        return res;
    }
    public static void main(String[] args) {
       int[] nums = {1};
        System.out.println(subsets2(nums));
    }
}
