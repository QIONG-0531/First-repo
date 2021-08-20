import java.util.Arrays;

public class Demo70 {
    //堆排序
    public static void heapSort(int[] arr){
        if(arr==null || arr.length==0) return;
        createBigHeap(arr);
        for(int i=arr.length-1;i>0;i--){
            int tmp=arr[0];
            arr[0]=arr[i];
            arr[i]=tmp;
            adjustDown(0,arr,i);
        }
    }
    public static void createBigHeap(int[] arr){
        for(int i=(arr.length-1-1)/2;i>=0;i--){
            adjustDown(i,arr,arr.length);
        }
    }
    public static void adjustDown(int parent,int[] arr,int len){
        int child=parent*2+1;
        while(child<len){
            if((child+1)<len && arr[child+1]>arr[child]){
                child++;
            }
            if(arr[child]>arr[parent]){
                int tmp=arr[parent];
                arr[parent]=arr[child];
                arr[child]=tmp;
            }
            parent=child;
            child=parent*2+1;
        }
    }
    public static void main(String[] args) {
        int[] arr={3,2,4,6,4,8};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
