import java.util.Arrays;

public class Demo4 {
    public static void main(String[] args) {
        int[]arr={9,5,2,7};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[]array){
        for(int i=0;i<array.length-1;i++){
            boolean flag=false;
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    flag=true;
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
            if(flag==false){
                break;
            }
        }
    }
}
