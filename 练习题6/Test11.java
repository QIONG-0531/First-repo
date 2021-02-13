import com.sun.org.apache.regexp.internal.RE;

public class Test11 {
    public static int myAtoi(String s) {
       char[]chars=s.toCharArray();
       int length=s.length();
       int index=0;
       while(index<length && chars[index]==' '){
           index++;
       }
       if(index>length){
           return 0;
       }
       int flag=1;
       if(chars[index]=='+'){
           index++;
       }
       if(chars[index]=='-'){
           flag=-1;
           index++;
       }
       int num=0,tmp=0,ret=0;
       while(index<length){
           num=chars[index]-'0';
           if(num<0 || num>9) break;
           tmp=ret;
           ret=ret*10+num;
           if(ret/10!=tmp){//越界除十前后不相等
               if(flag==-1){
                   return Integer.MIN_VALUE;
               }else{
                   return Integer.MAX_VALUE;
               }
           }
           index++;
       }
       return ret*flag;
    }

    public static void main(String[] args) {
        String str="-91283472332";
        System.out.println(myAtoi(str));
    }
}

