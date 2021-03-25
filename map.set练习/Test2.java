import java.util.HashSet;

public class Test2 {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set=new HashSet<>();
        int count=0;
        for(char x:jewels.toCharArray()){
            set.add(x);
        }
        for(int i=0;i<stones.length();i++){
            if(set.contains(stones.charAt(i))){
                count++;
            }
        }
        return count;
    }
}

