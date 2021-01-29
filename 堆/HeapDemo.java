import java.util.Arrays;

public class HeapDemo {
    public int[]elem;
    public int usedSize;
    public HeapDemo(){
        elem=new int[10];
    }
    public void adjustdown(int parent,int len){
        int child=parent*2+1;
        while(child<len) {
            if (child+1 < len&& elem[child]<elem[child+1]) {
                 child++;
            }
            if(elem[child]>elem[parent]){
                int tmp=elem[child];
                elem[child]=elem[parent];
                elem[parent]=tmp;
                parent=child;
                child=parent*2+1;
            }else{
                break;
            }
        }
    }
    public void creatBigHeap(int[] array){
        for(int i=0;i<array.length;i++){
            elem[i]=array[i];
            usedSize++;
        }
        for(int i=(usedSize-1-1)/2;i>=0;i--){
            adjustdown(i,usedSize);
        }
    }
    public void adjustup(int child){
        int parent=(child-1)/2;
        while(child>0){
            if(elem[child]>elem[parent]){
                int tmp=elem[child];
                elem[child]=elem[parent];
                elem[parent]=tmp;
                child=parent;
                parent=(child-1)/2;
            }else{
                break;
            }
        }
    }
    //放到最后，然后向上调整
    public void push(int val){
        if(elem.length==usedSize){
            elem= Arrays.copyOf(elem,2*elem.length);
        }
        elem[usedSize]=val;
        usedSize++;
        adjustup(usedSize-1);
    }
    //最后元素和第一个元素交换，然后向下调整,只调整0下标
    public int poll(){
        if(empty()) return -1;
        int ret=elem[0];
        int tmp=elem[0];
        elem[0]=elem[usedSize-1];
        elem[usedSize-1]=tmp;
        usedSize--;
        adjustdown(0,usedSize);
        return ret;
    }
    public int peek(){
        if(empty()) return -1;
        return elem[0];
    }
    public boolean empty(){
        return this.usedSize==0;
    }
    public void display(){
        for(int i=0;i<usedSize;i++){
            System.out.print(elem[i]+" ");
        }
        System.out.println();
    }
}
