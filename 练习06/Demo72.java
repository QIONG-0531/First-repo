import java.util.Arrays;

public class Demo72 {
    public static void mergeSort(int[] arr,int left,int right){
        if(arr==null || arr.length==0) return;
        //left==right的时候分解完成
        if(left>=right)return;
        int mid=(left+right)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left,mid,right);
    }
    public static void merge(int[] arr,int left,int mid,int right){
        int s1=left;
        int e1=mid;
        int s2=mid+1;
        int e2=right;
        int k=0;
        int[] tmp=new int[right-left+1];
        while(s1<=e1 && s2<=e2){
            //==保证稳定性
            if(arr[s1]<=arr[s2]){
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

    }
    public static void main(String[] args) {
        int[] arr={3,2,4,6,4,8};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
