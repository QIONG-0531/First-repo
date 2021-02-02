import java.util.Arrays;
import java.util.Stack;

public class Test {
    public static void insertSortBound(int[] array,int low,int high) {
        for(int i=1;i<array.length;i++){
            int tmp=array[i];
            int j=i-1;
            for(;j>=0;j--){
                if(array[j]>tmp){
                    array[j+1]=array[j];
                }else{
                    break;
                }
            }
            array[j+1]=tmp;
        }
    }
    public static int pivot(int[]array,int start,int end){
        int tmp=array[start];
        while(start<end){
            while(start<end && array[end]>tmp){
                end--;
            }
            if(start>=end){
                array[start]=tmp;
                break;
            }else{
                array[start]=array[end];
            }
            while(start<end && array[start]<tmp){
                start++;
            }
            if(start>=end){
                array[start]=tmp;
                break;
            }else{
                array[end]=array[start];
            }
        }
        array[start]=tmp;
        return start;

    }
    //快速排序非递归
    public static void quickSort(int[] array) {
        Stack<Integer> stack = new Stack<>();
        int low = 0;
        int high = array.length-1;
            int piv = pivot(array, low, high);//
            if (piv > low + 1) {
                stack.push(low);
                stack.push(piv - 1);
            }
            if (piv < high - 1) {
                stack.push(piv + 1);
                stack.push(high);
            }
            while (!stack.empty()) {
                high = stack.pop();
                low = stack.pop();
                piv = pivot(array, low, high);//
                if (piv > low + 1) {
                    stack.push(low);
                    stack.push(piv - 1);
                }
                if (piv < high - 1) {
                    stack.push(piv + 1);
                    stack.push(high);
                }
            }
        }


    public static void main(String[] args) {
        int[]array={2,12,34,3,13};
         quickSort(array);
        System.out.println(Arrays.toString(array));
    }
}
