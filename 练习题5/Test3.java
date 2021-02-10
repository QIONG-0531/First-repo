public class Test3 {
    //仅仅反转字母
    public  static  String reverseOnlyLetters(String S) {
            char[]chars=S.toCharArray();
            int i=0,j=chars.length-1;
            while(i<j){
                if(isLetter(chars[i])){
                    if(isLetter(chars[j])){
                        char tmp=chars[i];
                        chars[i]=chars[j];
                        chars[j]=tmp;
                        i++;
                        j--;
                    }else{
                        j--;
                    }
                }else{
                    if(isLetter(chars[j])){
                        i++;
                    }else{
                        i++;
                        j--;
                    }
                }
            }
            return new String(chars);
        }
        public static  boolean isLetter(char ch){
            return (ch>='a' && ch<='z') || (ch>='A'&& ch<='Z');
        }

    public static void main(String[] args) {
        String s="Test1ng-Leet=code-Q!";
        System.out.println(reverseOnlyLetters(s));
    }
}
