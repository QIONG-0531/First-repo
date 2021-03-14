import java.util.Arrays;

public class Test4 {
    //选择排序
    public static void selectSort(int[]array){
        for(int i=0;i<array.length;i++){
            int j=i+1;
            while (j<array.length){
                if(array[j]<array[i]){
                    int tmp=array[j];
                    array[j]=array[i];
                    array[i]=tmp;
                    j++;
                }
                else{
                    j++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[]array={6,10,8,3,7,1};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }

}
