import java.util.Arrays;
import java.util.Scanner;

public class TestDemo {
    //字节数组与字符串的转换
    public static void main3(String[] args) {
        String str ="helloworld";
        byte[]bytes=str.getBytes();
        System.out.println(Arrays.toString(bytes));//将字符串转换为字节数组
        System.out.println(new String(bytes));//将字节数组转化为字符串

    }
    //字符串与字符数组的转换
    public static void main2(String[] args) {
        char[]chars={'h','e','l','l','o'};
        System.out.println(new String(chars));//将字符数组的所有内容变成字符串
        System.out.println(new String(chars,1,3));//将部分字符数组的内容变为字符串
        String str="hello";
        System.out.println(str.charAt(1));//获得指定位置的字符
        System.out.println(str.toCharArray());//将字符串变为字符数组
    }
    public static void main1(String[] args) {
        String str1="hello";
        String str2=new String("hello");
        System.out.println(str1==str2);//false
        System.out.println(str1.equals(str2));//true
        String str3=new String("hello").intern();
        System.out.println(str1==str3);//true
    }
    //给一个字符类型的数组chas和一个整数size，请把大小为size的左半区整体右移到右半区，右半区整体移动到左边。
    public static String  reverse(String str,int left,int right){
        char[]chars=str.toCharArray();
        while(left<right){
            char tmp=chars[left];
            chars[left]=chars[right];
            chars[right]=tmp;
            left++;
            right--;
        }
        return  new String(chars);
    }
    public static String reverseK(String str,int k) {
        if(str==null|| k<=0 || k>str.length()){
            return null;
        }
        str=reverse(str,0,k-1);//先反转左边
        str=reverse(str,k,str.length()-1);//再反转右边
        str=reverse(str,0,str.length()-1);//最后反转整个字符串
        return str;
    }
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int k = scan.nextInt();
        String str = scan.next();
        String ret = reverseK(str,k);
        System.out.println(ret);
    }
}
