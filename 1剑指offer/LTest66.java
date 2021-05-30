import java.lang.reflect.Array;
import java.util.Arrays;

public class LTest66 {
    public static int[] plusOne(int[] digits) {
        int add=1;
        int i=digits.length-1;
        while(i>=0){
            digits[i]+=add;
            add=digits[i]/10;
            digits[i]=digits[i]%10;
            i--;
        }
        if(add!=0){
            digits=new int[digits.length+1];
            digits[0]=1;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[]arr={9};
        System.out.println(Arrays.toString(plusOne(arr)));
        StringBuilder sb=new StringBuilder();
    }
}
