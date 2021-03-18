import java.util.Arrays;

public class Test3 {
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
    public static void insertSort(int[]array,int low,int high){
        for(int i=low+1;i<=high;i++){
            int tmp=array[i];
            int j=i-1;
            while(j>=low) {
                if (array[j] > tmp) {
                    array[j + 1] = array[j];
                    j--;
                } else {
                    break;
                }
            }
            array[j+1]=tmp;
        }
    }
    //递归排序
    public static void quick(int[]array,int low,int high){
           if(low>=high) return;
           if(high-low<=50){
               insertSort(array,low,high);//给一个范围直接插入排序，越有序，越快
               return;
           }
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
