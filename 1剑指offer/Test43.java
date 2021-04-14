public class Test43 {
    //左旋字符串
    public String LeftRotateString(String str,int n) {
        char[]chars=new char[str.length()];
        if(str==null || str.length()==0){
            return new String(chars);
        }
        n=n%str.length();
        if(n>str.length()){
            return new String(chars);
        }
        int j=0;
        for(int i=n;i<chars.length;i++){
            chars[j++]=str.charAt(i);
        }
        for(int i=0;i<n;i++){
            chars[j++]=str.charAt(i);
        }
        return new String(chars);
    }
}
