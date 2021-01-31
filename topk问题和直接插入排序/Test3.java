import java.util.Arrays;

public class Test3 {
    //直接插入排序
    public static void insertsort(int[]array){
        for(int i=0;i<array.length;i++){
            int tmp=array[i];
            int j=i-1;
            for(;j>=0;j--){
                if(array[j]>tmp){
                    array[j+1]=array[j];
                }else{
                    break;
                }
            }
            array[j+1]=tmp;
        }
    }

    public static void main(String[] args) {
        int[]array={3,2,4,7,6};
        insertsort(array);
        System.out.println(Arrays.toString(array));
    }
}
