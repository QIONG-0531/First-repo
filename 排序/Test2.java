import java.util.Arrays;

public class Test2 {
    //选择排序
    public  static  void selectSort(int[]array){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[i]){
                    int tmp=array[i];
                    array[i]=array[j];
                    array[j]=tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[]arr={23,12,45,67,21,34};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
