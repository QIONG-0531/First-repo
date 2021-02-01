import java.util.Arrays;

public class Test4 {
    //快速排序
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
    public static void quick(int []array,int low,int high){
        if(low<high){
            int piv=pivot(array,low,high);
            quick(array,low,piv-1);
            quick(array,piv+1,high);
        }
    }
    public static void quickSort(int[]array){
        quick(array,0,array.length-1);
    }
    public static void main(String[] args) {
        int[]array={23,12,34,56,43,54};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }
}
