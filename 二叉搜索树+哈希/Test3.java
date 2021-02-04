import java.util.HashMap;

public class Test3 {
    //找到字符串中第一个不重复的字符
    public int firstUniqChar(String s) {
        char[]chars=s.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<chars.length;i++){
            if(!map.containsKey(chars[i])){
                map.put(chars[i],1);
            }else{
                int count=map.get(chars[i]);
                map.put(chars[i],count+1);
            }
        }
        for(int i=0;i<chars.length;i++){
            if(map.get(chars[i])==1){
                return i;
            }
        }
        return -1;


    }
}
