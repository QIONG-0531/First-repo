import java.util.Arrays;

public class Test {
    public static void main1(String[] args) {
        int x=20;
        int y=5;
        System.out.println(x+y+""+(x+y)+y);
        boolean flag=true;
        System.out.println(flag);
    }
    //实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
    public String toLowerCase(String str) {
        if(str==null){
            return null;
        }
        char[]chars=str.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(chars[i]>='a' && chars[i]<='z'){
                continue;
            }
            if(chars[i]>='A' && chars[i]<='Z'){
                chars[i]=(char)((int)chars[i]+(int)('z'-'Z'));
                continue;
            }
        }
        return new String(chars);

    }
    //给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
    public static void rotate(int[] nums, int k) {
        if(nums==null || k<0 ){
            return ;
        }
        k=k%nums.length;
        int[]arr=new int[nums.length];
        int j=0;
        for(int i=nums.length-k;i<nums.length; i++){
            arr[j]=nums[i];
            j++;
        }
        for(int i=nums.length-k-1;i>=0;i--){
            nums[i+k]=nums[i];
        }
        for(int i=0;i<k;i++){
            nums[i]=arr[i];
        }

    }

    public static void main(String[] args) {
        int[]arr=new int[]{1,2,3,4,5,6,7};
        rotate(arr,10);
        System.out.println(Arrays.toString(arr));
    }
}
