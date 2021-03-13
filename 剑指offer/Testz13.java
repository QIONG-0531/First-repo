import java.util.Arrays;
//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
// 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
public class Testz13 {
    public static int[] reOrderArray (int[] array) {
        if(array.length==1) return array;
        int  i=0;
        while(i<array.length){
            if(array[i]%2!=0){
                i++;
            }
            else{
                int tmp=array[i];
                int n=i;
                while((n+1)<array.length){
                    array[n]=array[n+1];
                    n++;
                }
                array[array.length-1]=tmp;
            }
            int left=0;
            int right=array.length-1;
            while(array[left]%2!=0){
                left++;
            }
            while(array[right]%2==0){
                right--;
            }
            if(left-1==right){
                return array;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[]array={1};
        System.out.println(Arrays.toString( reOrderArray(array)));
    }
}
