public class Test4 {
    //把？变成不连续的小写字母
    public String modifyString(String s) {
        char[]chars=s.toCharArray();
        if(chars.length==1){
            chars[0]='a';
            return new String(chars);
        }
        if(chars[0]=='?'){
            chars[0]='a';
            if(chars[0]==chars[1]){
                chars[0]='b';
            }
        }
        for(int i=1;i<chars.length-1;i++){
            if(chars[i]=='?'){
                chars[i]='a';
                while(chars[i]==chars[i-1] || chars[i]==chars[i+1]){
                    chars[i]+=1;
                }
            }
        }
        if(chars[chars.length-1]=='?'){
            chars[chars.length-1]='a';
            if(chars[chars.length-1]==chars[chars.length-2]){
                chars[chars.length-1]='b';
            }
        }
        return new String(chars);
    }
}
