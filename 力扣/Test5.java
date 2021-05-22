public class Test5 {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0 || strs==null) return "";
        String cur=strs[0];
        for(int i=1;i<strs.length;i++){
            cur=longest(cur,strs[i]);
            if(cur.length()==0){
                break;
            }
        }
        return cur;
    }
    public static String longest(String str1,String str2) {
        int len = Math.min(str1.length(), str2.length());
        int index = 0;
        while (index < len && str1.charAt(index) == str2.charAt(index)){
        index++;
       }
        return str1.substring(0,index);
    }

    public static void main(String[] args) {
        String[]strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }
}
