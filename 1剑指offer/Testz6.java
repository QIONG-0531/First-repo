public class Testz6 {
    //把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
    //输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
    //3,4,5,1,2   输出1
    public int minNumberInRotateArray(int [] array) {
        int left=0;
        int right=array.length-1;
        while(left<right){
            int mid=(left+right)/2;
            int target=array[right];//将右端数最为目标值，二分查找，缩小范围
            if(array[mid]>target){  //范围缩小到右边
                left=mid+1;
            }
            if(array[mid]<target){//范围缩小到左边
                right=mid;
            }
            if(array[mid]==target){//可能在左边，也可能在右边，只能right-1缩小范围
                right=right-1;
            }
        }
        return array[left];
    }
}
