public class Testz51 {
    //给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
    // 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
    // （注意：规定B[0] = A[1] * A[2] * ... * A[n-1]，B[n-1] = A[0] * A[1] * ... * A[n-2];）
    //对于A长度为1的情况，B无意义，故而无法构建，因此该情况不会存在。
    //除了当前位置的值，其余值相乘
    public int[] multiply(int[] A) {
        int[]B=new int[A.length];
        for(int i=0;i<A.length;i++){
            int temp=A[i];//保存当前值
            A[i]=1;//将当前位置的值赋值为1
            B[i]=1;
            for(int j=0;j<A.length;j++){
                B[i]*=A[j];
            }
            A[i]=temp;//乘完后再赋值回去
        }
        return B;
    }
}
