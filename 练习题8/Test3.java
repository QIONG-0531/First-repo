import java.util.Arrays;

public class Test3 {
    public static int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int l = 0;
        int r = 0;
        int len = chars.length;
        while (r < len){
            r++;
            while (r < len && chars[l] == chars[r]){
                r++;
            }
            sb.append(chars[l]);
            if(r - l > 1){
                sb.append(r - l);
            }
            l = r;
        }
        String s = sb.toString();
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        return s.length();
        }

    public static void main(String[] args) {
        char[]chars={'a','b','b','c','c'};
        System.out.println(compress(chars));
    }
    }

