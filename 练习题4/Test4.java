public class Test4 {
    //最后一个单词的长度
    public int lengthOfLastWord(String s) {
        if(s==null || s.isEmpty()){
            return 0;
        }
        s=s.trim();
        String[]str=s.split(" ");
        return str[str.length-1].length();

    }
}
