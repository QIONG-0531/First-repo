public class Test8 {
    //给你一个非空数组，返回此数组中 第三大的数 。如果不存在，则返回数组中最大的数。
    public  static int thirdMax(int[] nums) {
        long n1,n2,n3;
        n1=n2=n3=(long)Integer.MIN_VALUE-1;
        for(int x:nums){
            if(x>n3 && x!=n2 && x!=n1){
                if(x>n2 ){
                    if(x>n1){
                        n3=n2;
                        n2=n1;
                        n1=x;
                    }else{
                        n3=n2;
                        n2=x;
                    }
                }else{
                    n3=x;
                }
            }
        }
        if(n3==(long)Integer.MIN_VALUE-1){
            return (int)n1;
        }
        return (int)n3;
    }

    public static void main(String[] args) {
        int[]nums={3,2,1};
        System.out.println(thirdMax(nums));
        System.out.println(Integer.MIN_VALUE);
        System.out.println((long)Integer.MIN_VALUE-1);

    }
}
