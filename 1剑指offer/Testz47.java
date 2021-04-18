public class Testz47 {
    //求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
    public int Sum_Solution(int n) {
//         int ret=0;
//         ret=(int)Math.pow(n,2)+n;
//         return ret>>1;

        //使用相与的性质 短路求值  左边成立才执行右边
        //所以把递归条件写在左边，操作写在右边
        boolean flag=(n>1) && ((n+=Sum_Solution(n-1))>0);
        return n;
    }
}
