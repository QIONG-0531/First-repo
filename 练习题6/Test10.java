public class Test10 {
    //二进制加法
    public static String addBinary(String a, String b) {
        //用方法直接计算
//        return Integer.toBinaryString(
//                Integer.parseInt(a, 2) + Integer.parseInt(b, 2)
//        );
        //模拟列竖式计算
        StringBuilder str=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int c=0;
        while(i>=0 || j>=0){
            if(i>=0) c+=a.charAt(i--)-'0';
            if(j>=0) c+=b.charAt(j--)-'0';
            str.append(c%2);
            c>>=1;
        }
        str.reverse();
        String ret= str.toString();
        if(c>0){
            return '1'+ret;
        }
        return ret;
    }
    public static void main(String[] args) {
        int s=Integer.parseInt("88",10)+Integer.parseInt("100",10);
        System.out.println(Integer.toBinaryString(s));
    }
}
