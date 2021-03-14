import java.util.Arrays;
//希尔排序
public class Test3 {
    public static void shellSort(int []array){
        int[]drr={5,3,1};//增量数组
        for(int i=0;i<drr.length;i++){
            shell(array,i);//先以5为间隔排序，再以3为间隔排序，最后以1为间隔，越到最后越有序
        }
    }
    public static void shell(int[]array,int gap){
        for(int i=gap;i<array.length;i++){
            int j=i-gap;
            int tmp=array[i];
            while(j>=0){
                if(array[j]>tmp){
                    array[j+gap]=array[j];
                    j=j-gap;
                }
                else{
                    break;
                }
            }
            array[j+gap]=tmp;
        }
    }

    public static void main(String[] args) {
        int[]array={6,10,8,3,7,1};
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }
}
