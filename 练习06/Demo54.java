import java.util.Collections;

public class Demo54 {
    public int minArray(int[] numbers) {
        if(numbers==null || numbers.length==0) return -1;
        int left=0;
        int right=numbers.length-1;
        while(left<right){
            int mid=(left+right)/2;
            int target=numbers[right];
            //中间节点大于右端点，可以忽略左端
            if(numbers[mid]>target){
                left=mid+1;
                //中间节点小于右端点，可以忽略右端
            }else if(numbers[mid]<target){
                right=mid;
            }else{
                //中间节点和右端点相等，不知道在左边还是右边，但是可以去除右端点
                //就算他是最小的，还有中间节点的值可以用
                right=right-1;
            }
        }
        return numbers[left];


    }
}

