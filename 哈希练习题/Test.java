import java.util.Arrays;
//.比较字符串最小字母出现频次
public class Test {
    public static  int smallcount(String str){
        char[]chars=str.toCharArray();
        Arrays.sort(chars);
        int count=1;
        for(int i=1;i<chars.length;i++){
            if(chars[i]==chars[0]){
                count++;
            }
        }
        return count;
    }
    public static int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[]num1=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            num1[i]=smallcount(queries[i]);
        }
        int[]num2=new int[words.length];
        for(int i=0;i<words.length;i++){
            num2[i]=smallcount(words[i]);
        }
        int[]ret=new int[queries.length];
        int count;
        for(int i=0;i<num1.length;i++){
            count=0;
            for(int j=0;j<num2.length;j++){
                if(num2[j]>num1[i]){
                    count++;
                }
            }
            ret[i]=count;
        }
        return ret;
    }

    public static void main(String[] args) {
        String[] queries={"bba","abaaaaaa","aaaaaa","bbabbabaab","aba",
                "aa","baab","bbbbbb","aab","bbabbaabb"};
        String[] words={"aaabbb","aab","babbab","babbbb","b","bbbbbbbbab",
                "a","bbbbbbbbbb","baaabbaab","aa"};
        int[]ret=numSmallerByFrequency(queries,words);
        System.out.println(Arrays.toString(ret));
    }
}
