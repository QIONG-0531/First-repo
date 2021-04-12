import java.util.ArrayList;

public class Test42 {
    //输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
    // 如果有多对数字的和等于S，输出两个数的乘积最小的。
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        int left=0;
        int right=array.length-1;
        ArrayList<Integer>list=new ArrayList<>();
        while(left<right){
            if(array[left]+array[right]==sum){//最外层的即第一次找到的就是乘积最小的
                list.add(array[left]);
                list.add(array[right]);
                return list;
            }
            if((array[left]+array[right])>sum){//和大于sum说明右边的数过大
                right--;
            }
            if((array[left]+array[right])<sum){//和小于说明左边数过小
                left++;
            }
        }
        return list;
    }
}
