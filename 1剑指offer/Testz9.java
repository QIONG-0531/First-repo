public class Testz9 {
    //一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
    //n=1,1;n=2,2;n=3,4;n=4,5;
    public int jumpFloorII(int target) {
//      if(target==1 ) return 1;
//         int a=1;
//         int b=0;
//      for(int i=2;i<=target;i++){
//          b=a*2;
//          a=b;
//      }
//        return a;
//     }
        return (int)Math.pow(2,target-1);
    }
}

