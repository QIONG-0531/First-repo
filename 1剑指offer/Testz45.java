import java.util.Arrays;
import java.util.HashSet;

public class Testz45 {
    //扑克牌顺子（因为不能有重复数字，所以使用set）
    // 特点：最大的数字和最小数字差值不超过5且没有重复数字
    public static boolean IsContinuous(int [] numbers) {
        HashSet<Integer> set=new HashSet<>();
        Arrays.sort(numbers);
        int count=0;
        for(int x:numbers){
            if(x==0){
                count++;
            }else{
                set.add(x);
            }
        }
        if(set.size()+count!=5){//说明有重复数字
            return false;
        }
        if((numbers[4]-numbers[count])<5){//说明最大的数字和最小数字差值不超过5且没有重复数字
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[]array={1,3,0,7,0};
        System.out.println(IsContinuous(array));

    }
}
