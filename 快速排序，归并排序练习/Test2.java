import java.util.Arrays;
//快速排序优化
public class Test2 {
    public static int pivot(int[]array,int start,int end){
        int tmp=array[start];
        while(start<end){
            while(start<end && array[end]>=tmp){
                end--;
            }
            if(start>=end){
                break;
            }else{
                array[start]=array[end];
            }
            while(start<end && array[start]<=tmp){
                start++;
            }
            if(start>=end){
                break;
            }else{
                array[end]=array[start];
            }
        }
        array[start]=tmp;
        return  start;
    }
    public static void swap(int x,int y){
        int tmp=x;
        x=y;
        y=tmp;
    }
    //三数取中(array[mid]<=array[low]<=array[high]
    public static void mediumthree(int[] array,int low,int high){
        int mid=(low+high)/2;
        if(array[low]<array[mid]){
            swap(array[low],array[mid]);
        }
        if(array[low]>array[high]){
            swap(array[low],array[high]);
        }
        if(array[mid]>array[high]){
            swap(array[mid],array[high]);
        }
    }
    public static void quick(int[]array,int low,int high){
           if(low>=high) return;
            mediumthree(array, low, high);
            int piv=pivot(array,low,high);
            quick(array,low,piv-1);
            quick(array,piv+1,high);

    }
    public static void quickSort(int[]array){
        quick(array,0,array.length-1);
    }
    public static void main(String[] args) {
        int[]array={3,2,4,6,1,6,8};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }


}

