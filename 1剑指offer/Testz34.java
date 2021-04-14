import java.util.HashMap;

public class Testz34 {
    //返回第一个出现一次的字符的位置
    public int FirstNotRepeatingChar(String str) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:str.toCharArray()){
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else{
                int count=map.get(ch);
                map.put(ch,count+1);
            }
        }
        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
