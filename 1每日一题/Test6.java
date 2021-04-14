import java.util.HashMap;

public class Test6 {
    public int MoreThanHalfNum_Solution(int [] array) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(!map.containsKey(array[i])){
                map.put(array[i],1);
            }else{
                int count=map.get(array[i]);
                map.put(array[i],count+1);
            }
        }
        for(int x:array){
            if(map.get(x)>array.length/2){
                return x;
            }
        }
        return 0;
    }
}
