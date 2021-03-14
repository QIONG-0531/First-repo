import java.util.Arrays;

public class Test6 {
    //冒泡排序
    public static void bubbleSort(int[]array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[]array={6,10,8,3,7,1};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
