import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Test1 {
    //最常见的单词
    public static String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> set=new HashSet<>();
        for(String s:banned){
            set.add(s.toLowerCase());
        }
        HashMap<String,Integer> wordmap=new HashMap<>();
        paragraph=paragraph.toLowerCase();
        paragraph = paragraph.replace(',',' ');
        paragraph = paragraph.replace('.',' ');
        paragraph = paragraph.replace('!',' ');
        paragraph = paragraph.replace('?',' ');
        paragraph = paragraph.replace(';',' ');
        paragraph = paragraph.replace('\'',' ');
        String[]ret=paragraph.split(" ");//用空格将字符串分开，空格也要占数组
        for(int i=0;i<ret.length;i++){
            if(!set.contains(ret[i]) && !ret[i].equals("")){
                if(!wordmap.containsKey(ret[i])){
                    wordmap.put(ret[i],1);
                }
                else{
                    int count=wordmap.get(ret[i]);
                    wordmap.put(ret[i],count+1);
                }
            }
        }
        int max = 0;
        String maxString = "";
        for(String s : wordmap.keySet()){
            if(wordmap.get(s) > max){
                max = wordmap.get(s);
                maxString = s;
            }
        }
        return maxString;
    }

    public static void main(String[] args) {
       String paragraph = "Bob. hIt, baLl";
       String[] banned = {"bob", "hit"};
       String ret=mostCommonWord(paragraph, banned);
       System.out.println(ret);

    }
}
