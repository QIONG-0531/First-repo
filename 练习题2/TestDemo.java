import java.util.*;
public class TestDemo {
    
    //给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
    public static  int removeElement(int[] nums, int val) {
        if(nums==null || nums.length==0){
            return 0;
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
    public static void main3(String[] args) {
        int[]nums={2,3,4,5};
        System.out.println(removeElement(nums, 3));
    }
    //统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
    public static int countSegments(String s) {
            s=s+' ';
            char[]chars=s.toCharArray();
            int count=0;
            for(int i=0;i<chars.length-1;i++){
                if(chars[i]!=' '&&chars[i+1]==' '){
                    count++;
                }
            }
            return count;
        }
    public static  int countSegments1(String s) {
        int segmentCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i-1) == ' ') && s.charAt(i) != ' ') {
                segmentCount++;
            }
        }

        return segmentCount;
    }

    public static void main2(String[] args) {
        String str="hello bit ao";
        System.out.println(countSegments1(str));
    }
    public static void main1(String[] args) {
        /*String str=null;
        System.out.println(str.isEmpty());*/
        String str2="";
        System.out.println(str2.isEmpty());
    }
}
