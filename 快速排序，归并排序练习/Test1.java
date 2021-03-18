import java.util.Arrays;
//快速排序
public class Test1 {
    //找基准
    public static int pivot(int[]array,int start,int end){
        int tmp=array[start];
        while(start<end){
            //先从end走
            while(start<end && array[end]>=tmp){
                end--;
            }
            if(start>=end){
                break;
            }else{
                array[start]=array[end];
            }
            //然后从start走
            while(start<end&& array[start]<=tmp){
                start++;
            }
            if(start>=end){
                break;
            }else{
                array[end]=array[start];
            }
        }
        array[start]=tmp;
        return start;
    }
    //递归排序
    public static void quick(int[]array,int low,int high){
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
        int[]array={3,2,4,6,1,6,8};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }
}
