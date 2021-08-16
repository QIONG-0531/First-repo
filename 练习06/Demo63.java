import java.util.HashMap;

public class Demo63 {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            if(map.containsKey(x)){
                int count=map.get(x);
                map.put(x,count+1);
            }else{
                map.put(x,1);
            }
        }
        for(int x:nums){
            if(map.get(x)>nums.length/2){
                return x;
            }
        }
        return -1;

    }
}
