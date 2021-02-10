import java.util.HashSet;

public class Test {
    //给定一个整数数组，判断是否存在重复元素。
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int flag=0;
        for(int x:nums){
            if(set.contains(x)){
                flag=1;
            }
            set.add(x);
        }
        if(flag==1) return true;
        return false;
    }
}
