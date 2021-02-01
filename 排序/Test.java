import java.util.Arrays;

public class Test {
    //希尔排序
    public static void shell(int[] array ,int gap) {
         for(int i=gap;i<array.length;i++){
             int tmp=array[i];
             int j=i-gap;
             for(;j>=0;j=j-gap){
                 if(array[j]>tmp){
                     array[j+gap]=array[j];
                 }
                 else{
                     break;
                 }
             }
             array[j+gap]=tmp;
         }
    }

    public static void shellSort(int[] array) {
        int[] drr = {7,5,1};//增量数组(将数组分割成几部分，增量数组必须是素数）

        for (int i = 0; i < drr.length; i++) {
            shell(array,drr[i]);
        }
    }

    public static void main(String[] args) {
        int[]array={2,13,53,63,23,54,5,67};
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }

}
