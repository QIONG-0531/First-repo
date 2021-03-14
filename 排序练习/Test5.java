import java.util.Arrays;

public class Test5 {
    //堆排序(从小到大，建大堆）
    public static void heapSort(int[]array){
        createBigHeap(array);
        for(int i=array.length-1;i>=0;i--){
            int tmp=array[0];
            array[0]=array[i];
            array[i]=tmp;
            adjustdown(array,0,i);
        }
    }
    public static void createBigHeap(int []array){
        for(int i=(array.length-1-1)/2;i>=0;i--){
            adjustdown(array,i,array.length);
        }
    }
    public static void adjustdown(int[]array,int parent,int size){
        int child=parent*2+1;
        while(child<size){
            if((child+1)<size && array[child+1]>array[child]){
                child++;
            }
            if(array[parent]<array[child]){
                int tmp=array[parent];
                array[parent]=array[child];
                array[child]=tmp;
                parent=child;
                child=parent*2+1;
            }
            else{
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[]array={6,10,8,3,7,1};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }
}
