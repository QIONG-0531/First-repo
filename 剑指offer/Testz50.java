import java.util.HashMap;

public class Testz50 {
    //请找出数组中任一一个重复的数字。
    public int duplicate (int[] numbers) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:numbers){
            if(!map.containsKey(x)){
                map.put(x,1);
            }else{
                int count=map.get(x);
                map.put(x,count+1);
            }
        }
        for(int x:numbers){
            if(map.get(x)>1){
                return x;
            }
        }
        return -1;
    }
}
