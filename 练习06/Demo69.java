import java.util.Arrays;

public class Demo69 {
    //直接插入排序
    public static void insertSort(int[] arr){
        if(arr==null || arr.length==0) return;
        for(int i=1;i<arr.length;i++){
            int tmp=arr[i];
            int j=i-1;
            for(;j>=0;j--){
                if(arr[j]>tmp){
                    arr[j+1]=arr[j];
                }else{
                    break;
                }
            }
            arr[j+1]=tmp;
        }
    }
    //选择排序
    public static void selectSort(int[] arr){
        if(arr==null || arr.length==0){
            return;
        }
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    min=j;
                }
            }
            int tmp=arr[i];
            arr[i]=arr[min];
            arr[min]=tmp;
        }
    }
    public static void main(String[] args) {
        int[] arr={3,2,4,6,4,8};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
