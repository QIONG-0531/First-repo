public class Test6 {
    //返回参数二进制中1的个数
    public static int sum(int num){
        int count=0;
        while(num!=0){
            if((num&1)==1){
                count++;
            }
            num=num>>1;
        }
        return count;
    }
    public static int sum1(int num){
        int count=0;
        while(num!=0){
            num=num&(num-1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(sum(7));
    }
}
