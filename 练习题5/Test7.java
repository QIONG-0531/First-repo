import java.util.HashSet;

public class Test7 {
    public static int thirdMax(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        int[]num=new int[set.size()];
        int i=0;
        for(int x:set){
            num[i++]=x;
        }
        if(num.length<3){
            return num[num.length-1];
        }
        return num[2];
    }
}
