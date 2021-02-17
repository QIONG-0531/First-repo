import java.util.Arrays;

public class Test {
    //查找数组中指定元素(二分查找)
    public static int binarySearch(int[] arr, int toFind){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(toFind<arr[mid]){
                right=mid-1;
            }
            else if(toFind>arr[mid]){
                left=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    //检查数组的有序性
    public static boolean isSorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    //数组排序(冒泡排序)
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
    }
    // 数组逆序
    public static void reverse(int[] arr){
      int left=0;
      int right=arr.length-1;
      while(left<right){
          int tmp=arr[left];
          arr[left]=arr[right];
          arr[right]=tmp;
          left++;
          right--;
      }
    }
    //给定一个整型数组, 将所有的偶数放在前半部分, 将所有的奇数放在数组后半部分
    public static void transform(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            while(left<right && arr[left]%2==0){
                  left++;
            }
            while(left<right && arr[right]%2!=0){
                right--;
            }
            int tmp=arr[left];
            arr[left]=arr[right];
            arr[right]=tmp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[]arr=new int[]{2,1,23,14,22};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        transform(arr);
        System.out.println(Arrays.toString(arr));
    }
}
