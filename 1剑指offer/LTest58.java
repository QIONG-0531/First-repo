public class LTest58 {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        if(s=="") return 0;
        String[]str=s.split(" ");
        return str[str.length-1].length();
    }
}
