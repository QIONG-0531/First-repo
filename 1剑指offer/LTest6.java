public class LTest6 {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        int len=needle.length();
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0) && (i+needle.length())<haystack.length()){
                if(haystack.substring(i,i+len).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}
