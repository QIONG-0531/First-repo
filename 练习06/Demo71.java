import com.sun.scenario.effect.Brightpass;
import com.sun.xml.internal.org.jvnet.mimepull.CleanUpExecutorFactory;

import java.util.Arrays;

public class Demo71 {
    //快速排序
    public static void quickSort(int[] arr,int left,int right){
        if(arr==null || arr.length==0){
            return;
        }
        if(left>right)return;
        int piv=pivot(arr,left,right);
        quickSort(arr,left,piv-1);
        quickSort(arr,piv+1,right);
    }
    public static int pivot(int[] arr,int low,int high){
        int tmp=arr[low];
        while(low<high){
            while(low<high && arr[high]>=arr[low]){
                high--;
            }
            if(low>=high){
                arr[low]=tmp;
                break;
            }else{
                arr[low]=arr[high];
            }
            while(low<high && arr[low]<=tmp){
                low++;
            }
            if(low>=high){
                arr[low]=tmp;
                break;
            }else{
                arr[high]=arr[low];
            }
        }
        arr[low]=tmp;
        return low;
    }
    public static void main(String[] args) {
        int[] arr={3,2,4,6,4,8};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
