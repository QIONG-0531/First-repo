import java.util.Arrays;

public class Test3 {
    //堆排序
    public static void adjustdown(int[]array,int parent,int uesdSize){
        int child=parent*2+1;
        while(child<uesdSize){
            if(child+1 <uesdSize && array[child]<array[child+1]){
                child++;
            }
            if(array[child]>array[parent]){
                int tmp=array[child];
                array[child]=array[parent];
                array[parent]=tmp;
                parent=child;
                child=parent*2+1;
            }
            else{
                break;
            }
        }
    }
    public static void creatBigheap(int[]array){
        for(int i=(array.length-1-1)/2;i>=0;i--){
            adjustdown(array,i,array.length);
        }
    }
    public static void heapSort(int[]array){
        creatBigheap(array);
        int usedSize=array.length-1;
        while(usedSize>0){
            int tmp=array[0];
            array[0]=array[usedSize];
            array[usedSize]=tmp;
            adjustdown(array,0,usedSize);
            usedSize--;
        }
    }

    public static void main(String[] args) {
        int[]array={23,12,34,56,43,54};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }
}
