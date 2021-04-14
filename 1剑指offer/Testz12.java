public class Testz12 {
    //给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
    //次方可能是复数，底数也可能是负数
    public double Power(double base, int exponent) {
        //return Math.pow(base,exponent);
        double ret=0;
        int flag=0;
        if(exponent==0) return 1;
        if(exponent==1) return base;
        if(exponent<0) {
            exponent=-exponent;
            flag=1;
        }
        for(int i=2;i<=exponent;i++){
            ret+=base*base;
        }
        if(flag==1){
            ret=1/ret;
        }
        if(base<0  && (exponent%2)!=0){
            ret=-ret;
        }

        return ret;
    }
}
