import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {
        int[]arr=new int[]{1,2,3};
        //int[]newArr= Arrays.copyOf(arr,2);
       //System.out.println(Arrays.toString(newArr));

        /*int[]newArr=new int[arr.length];
        System.arraycopy(arr,0,newArr,0,arr.length);
        System.out.println(Arrays.toString(newArr));*/

        int[]newArr=arr.clone();
        System.out.println(Arrays.toString(newArr));
    }
}
