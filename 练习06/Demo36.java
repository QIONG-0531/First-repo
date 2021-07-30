import java.util.Arrays;
import java.util.HashSet;

public class Demo36 {
    public boolean IsContinuous(int [] numbers) {
        //1.使用set存储不为0的数字，去除重复数字
        //2.验证0的个数加上set的大小是否等于5
        //set里的最大值和最小值  差值小于5
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
        if(set.size()+count!=5){
            return false;
        }
        if((numbers[4]-numbers[count])<5){
            return true;
        }
        return false;

    }
}
