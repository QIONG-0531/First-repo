import java.util.ArrayList;
import java.util.List;

public class Demo16 {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        int i=0;
        String str="";
        while(i<nums.length){
            int left=nums[i];
            while((i+1)<nums.length && nums[i+1]==nums[i]+1){
                i++;
            }
            int right=nums[i];
            i++;
            if(left==right){
                str=String.valueOf(left);
                list.add(str);
            }else{
                str=left+"->"+right;
                list.add(str);
            }
        }
        return list;

    }
}
