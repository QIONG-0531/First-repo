public class LTest125 {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='0' && s.charAt(i)<='9') || s.charAt(i)>='a' && s.charAt(i)<='z'){
                sb.append(s.charAt(i));
            }
        }
        String str=sb.toString();
        int left=0;
        int right=str.length()-1;
        while (left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }
}
