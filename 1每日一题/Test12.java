public class Test12 {
    public int StrToInt(String str) {
        //把字符串转化为整数
        if(str.length()==0 || str=="") return 0;
        char[]chars=str.toCharArray();
        int flag=1;
        if(chars[0]=='+'){
            chars[0]='0';
        }
        if(chars[0]=='-'){
            flag=-1;
            chars[0]='0';
        }
        int ret=0;
        for(int i=0;i<chars.length;i++){
            if(chars[i]<'0' || chars[i]>'9'){
                return 0;
            }
            ret=ret*10+(int)(chars[i]-'0');
        }
        return ret*flag;
    }
}
