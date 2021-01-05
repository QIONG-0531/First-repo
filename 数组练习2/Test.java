import java.util.Arrays;

public class Test {
    //给定一个整型数组，将所有偶数放在前半部分，将奇数放在数组后半部分
    public static void transform(int[]arr){
        int i=0;
        int j=arr.length-1;//让奇数和偶数互换
        while (i<j){
            while(i<j&&arr[i]%2==0){
                i++;//找到奇数
            }
            while(i<j&&(arr[j]%2)!=0){
                j--;//找到偶数
            }
            int tmp=arr[i];
            arr[i]=arr[j];
            arr[j]=tmp;
        }
    }
    public static void main12(String[] args) {
        int[]arr={2,3,4,5,1};
        transform(arr);
        System.out.println(Arrays.toString(arr));
    }
    //数组逆序
    public static int[] reverse(int[]arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int tmp=arr[left];
            arr[left]=arr[right];
            arr[right]=tmp;
            left++;
            right--;
        }
        return arr;
    }
    public static void main11(String[] args) {
        int[]arr={1,2,3,4};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reverse(arr)));
    }
    //二分查找Array.binarySearch
    public static void main10(String[] args) {
        int[]arr={11,22,33,44,55};
        System.out.println(Arrays.binarySearch(arr,55));
    }
    //找数组中的最大元素
    public static int findmax(int[]arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main9(String[] args) {
        int[]arr={5,4,6,7,9};
        System.out.println(findmax(arr));
    }
    //用.clone拷贝
    public static void main8(String[] args) {
        int[]arr={1,2,3,4};
        int[]ret=arr.clone();
        System.out.println(Arrays.toString(ret));
    }
    //用System.arraycopy拷贝
    public static void main7(String[] args) {
        int[]arr={1,2,3,4};
        int[]ret=new int[arr.length];
        System.arraycopy(arr,0,ret,0,arr.length);
        System.out.println(Arrays.toString(ret));
    }
    //用copyof拷贝
    public static void main6(String[] args) {
        int[]arr={1,2,3,4};
        int[]ret=Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(ret));
    }
    //实现一个方法 toString, 把一个整型数组转换成字符串.
    // 例如数组 {1, 2, 3} , 返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.
    public static String mytoString(int[]arr){
        String ret="[";
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                ret=ret+arr[i]+"]";
            }
            else {
                ret=ret+arr[i]+",";
            }
        }
        return ret;
    }
    public static void main5(String[] args) {
        int[]arr={1,2,3};
        System.out.println(mytoString(arr));
    }
    //实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组
    public static int[] copy(int[]arr){
        int[]ret=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ret[i]=arr[i];
        }
        return ret;
    }
    public static void main4(String[] args) {
        int[]arr={1,2,3,4};
        System.out.println(Arrays.toString(copy(arr)));
    }
    //给定一个有序整型数组, 实现二分查找
    public static int find(int[]arr,int target){
        int left=0;
        int right=arr.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if(target>arr[mid]){
                left=mid+1;
            }
            else if(target<arr[mid]){
                right=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main3(String[] args) {
        int[]arr=new int[]{1,2,3,4};
        System.out.println(find(arr, 5));
    }
    //给定一个整型数组, 判定数组是否有序（递增
    public static boolean sort(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main2(String[] args) {
        int[]arr={1,3,2,4,5};
        System.out.println(sort(arr));

    }
    //给定一个整型数组, 实现冒泡排序(升序排序)
    public static void bublesort(int []arr){
        boolean a=false;
        for(int i=0;i<arr.length-1;i++){
            a=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                    a=true;
                }
            }
            if(a==false){
                return;
            }
        }
    }
    public static void main1(String[] args) {
        int[]arr={2,3,1,6,5};
        bublesort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
