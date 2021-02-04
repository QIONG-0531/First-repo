import java.util.HashMap;

public class Test5 {
    //给定两个字符串 s 和 t，判断它们是否是同构的。
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map1=new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
            if((map1.containsKey(a) && map1.get(a)!=b) || (map2.containsKey(b)&&map2.get(b)!=a)){
                return false;
            }
            map1.put(a,b);
            map2.put(b,a);
        }
        return true;
    }
}


