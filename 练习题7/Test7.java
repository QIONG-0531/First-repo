public class Test7 {
    //获取一个数二进制序列的偶数位和奇数位
    public static void two(int num){
        System.out.println("偶数");
        for(int i=31;i>=0;i-=2){
            if ((num & (1 << i)) != 0) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        }
        System.out.println();
        System.out.println("奇数");
        for(int i=30;i>=0;i-=2){
            if ((num & (1 << i)) != 0) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        }
    }

    public static void main(String[] args) {
        two(5);
    }
}
