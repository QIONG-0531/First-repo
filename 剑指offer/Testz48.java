public class Testz48 {
    //写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
    //使用位运算
    public int Add(int num1,int num2) {
        int sum=0;
        int add=0;
        while(num2!=0){
            sum=num1^num2;//两个数的无进位之和就是异或的结果
            add=(num1&num2)<<1;//进位就是相与再左移一位
            num1=sum;//然后再把无进位的和与进位数相加，直至进位数为0
            num2=add;
        }
        return num1;
    }
}
