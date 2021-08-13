import java.util.Arrays;

public class Demo53 {
    //直接插入排序
    public static void insertSort(int[] arr){
        if(arr == null || arr.length == 0){
            return;
        }
        for(int i=1;i<arr.length;i++){
            int tmp = arr[i];
            int j = i-1;
            for(;j>=0;j--){
                if(arr[j] > tmp){
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }
            arr[j+1] = tmp;
        }
    }
    //选择排序
    public static void selectSort(int[] arr){
        if(arr == null || arr.length == 0){
            return;
        }
        for(int i=0;i<arr.length;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    min=j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
    }
    //冒泡排序
    public static void bubbleSort(int[] arr){
        if(arr == null || arr.length == 0){
            return;
        }
        for(int i=0;i<arr.length-1;i++){
            boolean flag=true;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    flag=false;
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
            if(flag){
                break;
            }
        }
    }
    //堆排序
    public static void heapSort(int[] arr){
        if(arr == null || arr.length ==0) return;
        //升序，建大堆
        createBigHeap(arr);
        for(int i=arr.length-1;i>0;i--){
            int tmp=arr[0];
            arr[0]=arr[i];
            arr[i]=tmp;
            adjustDown(arr,0,i);
        }
    }
    public static void createBigHeap(int[] arr){
        for(int i=(arr.length-1-1)/2;i>=0;i--){
            adjustDown(arr,i,arr.length);
        }
    }
    public static void adjustDown(int[] arr,int parent,int len){
        int child = parent*2+1;
        while(child<len){
            if((child+1)<len && arr[child]<arr[child+1]){
                child++;
            }
            if(arr[child]>arr[parent]) {
                int tmp = arr[parent];
                arr[parent] = arr[child];
                arr[child] = tmp;
                parent=child;
                child=parent*2+1;
            }else{
                break;
            }
        }
    }
    //快速排序，找基准，递归
    public static void quickSort(int[] arr){
        quickSortChild(arr,0,arr.length-1);
    }
    public static void quickSortChild(int[] arr,int left,int right){
        if(left>=right) return;
        int piv=findPiv(arr,left,right);
        quickSortChild(arr,left,piv-1);
        quickSortChild(arr,piv+1,right);
    }
    public static int findPiv(int[] arr,int left,int right){
        int tmp = arr[left];
        while(left<right){
            while(left<right && arr[right]>tmp){
                right--;
            }
            if(left>=right){
                arr[left]=tmp;
                break;
            }else{
                arr[left]=arr[right];
            }
            while(left<right && arr[left]<tmp){
                left++;
            }
            if(left>=right){
                arr[left]=tmp;
                break;
            }else{
                arr[right]=arr[left];
            }
        }
        arr[left]=tmp;
        return left;

    }
    //归并排序,分解合并
    public static void mergeSort(int[] arr){
        mergeSortChild(arr,0,arr.length-1);
    }
    public static void mergeSortChild(int[] arr,int left,int right){
        if(left>=right) return;
        int mid=(left+right)/2;
        mergeSortChild(arr,left,mid);
        mergeSortChild(arr,mid+1,right);
        merge(arr,left,mid,right);
    }
    public static void merge(int[] arr,int low,int mid,int high){
        int[] tmp=new int[high-low+1];
        int s1=low;
        int e1=mid;
        int s2=mid+1;
        int e2=high;
        int k=0;
        while(s1<=e1 && s2<=e2){
            if(arr[s1]<arr[s2]){
                tmp[k++]=arr[s1++];
            }else{
                tmp[k++]=arr[s2++];
            }
        }
        while(s1<=e1){
            tmp[k++]=arr[s1++];
        }
        while(s2<=e2){
            tmp[k++]=arr[s2++];
        }
        for(int i=0;i<tmp.length;i++){
            arr[i+low]=tmp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {33,22,11,44,55};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
