public class Test3 {
    //给定一个字符串，判断其是否全部由数字组成
    public static boolean isNumber(String str){
        char[]chars=str.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(chars[i]<'0' || chars[i]>'9'){
                return false;
            }
        }
        return true;
    }

    public static void main1(String[] args) {
        String str="1234";
        System.out.println(isNumber(str));
        String str1=new String("1234").intern();//intern 手动入池
        System.out.println(str==str1);
    }

    public static void main(String[] args) {
        String str="hello world hello bit";
        String[]result=str.split(" ",2);
        for(String s:result){
            System.out.println(s);
        }
    }
}
