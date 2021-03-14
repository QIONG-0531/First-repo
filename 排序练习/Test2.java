import java.util.Arrays;

public class Test2 {
    //直接插入排序
    public static void insertSort(int[]array){
        for(int i=1;i<array.length;i++){
            int j=i-1;
            int tmp=array[i];
            while (j>=0){
                if(array[j]>tmp){
                    array[j+1]=array[j];
                    j--;
                }
                else{
                    break;
                }
            }
            array[j+1]=tmp;
        }
    }

    public static void main(String[] args) {
        int[]array={6,10,8,3,7,1};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
