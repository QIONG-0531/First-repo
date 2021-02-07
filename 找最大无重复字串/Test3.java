import java.util.HashSet;

public class Test3 {
    //给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            HashSet<Character> set= new HashSet<>();
            set.add(s.charAt(i));
            for(int j=i+1;j<s.length();j++){
                if(!set.contains(s.charAt(j))){
                    set.add(s.charAt(j));
                }
                else{
                    break;
                }
            }
            int count=set.size();
            max=count>max?count:max;
        }
        return max;
    }
}
