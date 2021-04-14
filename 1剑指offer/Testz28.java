import java.util.*;
    public class Testz28 {
        //数组中出现次数超过一半的数字
        public int MoreThanHalfNum_Solution(int [] array) {
            HashMap<Integer,Integer>map=new HashMap<>();
            for(int x:array){
                if(!map.containsKey(x)){
                    map.put(x,1);
                }else{
                    int count=map.get(x);
                    map.put(x,count+1);
                }
            }
            for(int i=0;i<array.length;i++){
                if(map.get(array[i])>(array.length/2)){
                    return array[i];
                }
            }
            return 0;
        }
    }

