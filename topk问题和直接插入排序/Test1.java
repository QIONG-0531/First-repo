import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Test1 {
    public static void smallheap(int []array){
        PriorityQueue<Integer>heap=new PriorityQueue<>();
        for(int i=0;i<array.length;i++){
            heap.offer(array[i]);
        }
        System.out.println(heap.toString());
    }

    public static void main(String[] args) {
        int[]array={23,12,45,34,65,47};
        System.out.println(Arrays.toString(array));
        smallheap(array);

    }
    public static void adjustdown(int[]array,int parent,int usedSize){
        int child=parent*2+1;
        while(child<usedSize){
            if (child+1<usedSize && array[child]<array[child+1]){
                child++;
            }
            if(array[child]>array[parent]){
                int tmp=array[child];
                array[child]=array[parent];
                array[parent]=tmp;
                parent=child;
                child=parent*2+1;
            }else{
                break;
            }
        }
    }
    public static void creatbigheap(int[]array){
        for(int i=(array.length-1-1)/2;i>=0;i--){
            adjustdown(array,i,array.length);
        }
    }
    //从小到大排序，建大堆
    public static void sort(int[]array){
        creatbigheap(array);
        int end=array.length-1;
        while(end>0){
            int tmp=array[0];
            array[0]=array[end];
            array[end]=tmp;
            adjustdown(array,0,end);
            end--;
        }
    }
    public static void main1(String[] args) {
        int[]array={23,12,45,34,65,47};
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));

    }
}
