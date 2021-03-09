import java.util.Arrays;

class Heap{
    int[]elem;
    public Heap(int[] elem) {
        this.elem = elem;
    }
    public void creatBigHeap(){
        for(int i=(elem.length-1-1)/2;i>=0;i--){
            adjustDown(i);
        }
    }
    public void adjustDown(int parent) {
        int child = parent * 2 + 1;
        while (child < elem.length) {
            if ((child + 1) < elem.length && elem[child] < elem[child + 1]) {
                child = child + 1;
            }
            if (elem[child] > elem[parent]) {
                int tmp = elem[child];
                elem[child] = elem[parent];
                elem[parent] = tmp;
                parent = child;
                child = parent * 2 + 1;
            }else{
                break;
            }
        }
    }
    public void creatSmallHeap(){
        for(int i=(elem.length-1-1)/2;i>=0;i--){
            adjustDown1(i);
        }
    }
   public void adjustDown1(int parent){
        int child=parent*2+1;
        while(child<elem.length){
            if((child+1)<elem.length && elem[child+1]<elem[child]){
                child++;
            }
            if(elem[child]<elem[parent]){
                int tmp = elem[child];
                elem[child] = elem[parent];
                elem[parent] = tmp;
                parent = child;
                child = parent * 2 + 1;
            }else{
                break;
            }
        }
   }
}
public class Test5 {
    public static void main(String[] args) {
        int[] array = { 27,15,19,18,28,34,65,49,25,37 };
        Heap heap=new Heap(array);
//        heap.creatBigHeap();
//        System.out.println(Arrays.toString(heap.elem));
        heap.creatSmallHeap();
        System.out.println(Arrays.toString(heap.elem));
    }
}
