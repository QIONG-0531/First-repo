import java.util.HashSet;
import java.util.Set;

public class LTest7 {
    public static boolean wordBreak(String s, Set<String> dict) {
        if(s.length()==0) return false;
        boolean[]canbreak=new boolean[s.length()+1];
        for(int i=1;i<=s.length();i++){
            if(dict.contains(s.substring(0,i))){
                canbreak[i]=true;
                continue;
            }
            for(int j=i-1;j>0;j--){
                if(canbreak[j] && dict.contains(s.substring(j,i))){
                    canbreak[i]=true;
                    break;
                }
            }
        }
        return canbreak[s.length()];
    }

    public static void main(String[] args) {
        String s="a";
        Set<String> set=new HashSet<>();
        set.add("a");
        System.out.println(wordBreak(s,set));
    }
}
