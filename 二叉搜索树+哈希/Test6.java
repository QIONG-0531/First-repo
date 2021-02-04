import java.util.HashSet;

public class Test6 {
    //找出只出现了一次的那个数字
    public static  int singleNumber(int[]nums){
        HashSet<Integer>set=new HashSet<>();
        for(int x:nums){
            if(set.contains(x)){
                set.remove(x);
            }else{
                set.add(x);
            }
        }
        for(int x:set){
            return x;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]array={11,11,33,22,33};
        System.out.println(singleNumber(array));
    }
}
