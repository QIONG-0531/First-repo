public class Demo37 {
    public int Add(int num1,int num2) {
        //进位是两个数相与  再左移
        //和是两个数异或
        int sum=0;
        int add=0;
        while(num2!=0){
            sum=num1^num2;
            add=(num1&num2)<<1;
            num1=sum;
            num2=add;
        }
        return num1;
    }
}
