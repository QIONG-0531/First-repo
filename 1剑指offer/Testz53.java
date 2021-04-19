public class Testz53 {
    //请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
    // 例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。
    // 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是
    public  static boolean isNumeric (String str) {
        char[]chars=str.toCharArray();
        boolean e=false;
        boolean point=false;
        int eindex=chars.length;
        boolean left=false;
        boolean right=false;
        for(int i=0;i<chars.length;i++){
            if(chars[i]=='.'){
                if(point || i>eindex || i==chars.length-1) return false;
                point=true;
            }
            else if(chars[i]=='e' || chars[i]=='E'){
                if(e || i==0 || i==chars.length-1 ) return false;
                if((i-1)>=0 && (chars[i-1]=='+' || chars[i-1]=='-')) return false;
                e=true;
                eindex=i;
            }
            else  if(chars[i]=='+' || chars[i]=='-'){
                if(i<eindex){
                    if(left || i!=0 || i==chars.length-1) return false;
                    left=true;
                }
                if(i>eindex){
                    if(right || i!=eindex+1 || i==chars.length-1) return false;
                    right=true;
                }
            }
            else if(chars[i]>='0' && chars[i]<='9'){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
     String str="+e3";
     System.out.println(isNumeric(str));
    }
}
