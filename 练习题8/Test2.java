public class Test2 {
    //验证回文串
    public static boolean isPalindrome(String s) {
        StringBuilder str=new StringBuilder();
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='0' && s.charAt(i)<='9')||(s.charAt(i)>='a' && s.charAt(i)<='z')){
                str.append(s.charAt(i));
            }
        }
        String s1=str.toString();
        str.reverse();
        if(s1.equals(str.toString())){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s="race a car";
        System.out.println(isPalindrome(s));
    }
}
