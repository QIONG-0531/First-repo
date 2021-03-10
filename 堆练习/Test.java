import javafx.scene.layout.Priority;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class MyPriorityQueue{
        public int[]elem;
        public int usedSize;
        public MyPriorityQueue(){
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
       public void push(int val){
            if(elem.length==usedSize){
                elem= Arrays.copyOf(elem,2*elem.length);
            }
            elem[usedSize]=val;//添加到队尾
            usedSize++;
            adjustup(usedSize-1);//向上调整
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
                }
                else{
                    break;
                }
            }
       }
       public void poll(){
            if(usedSize==0) return;
            int tmp=elem[0];
            elem[0]=elem[usedSize-1];
            elem[usedSize-1]=tmp;//第一个元素和最后一个元素交换
            usedSize--;
            adjustdown(0,usedSize);//0号元素向下调整
       }
       public int peek(){
            if(usedSize==0) return -1;
            return elem[0];
       }
       public void display(){
            for(int i=0;i<usedSize;i++){
                System.out.print(elem[i]+" ");
            }
           System.out.println();
       }
     //堆排序（从小到大排序，建大堆）
       public void heapsort(int[]array){
            creatBigHeap(array);
           for(int i=usedSize-1;i>=0;i--){
               int tmp=elem[i];
               elem[i]=elem[0];
               elem[0]=tmp;
               adjustdown(0,i);
           }
    }
    //建小堆
    public void creatSmallHeap(int []array){
            for(int i=0;i<array.length;i++){
                elem[i]=array[i];
                usedSize++;
            }
            for(int i=(usedSize-1-1)/2;i>=0;i--){
                adjustdown2(i,usedSize);
            }
    }
    public void adjustdown2(int parent,int len){
            int child=parent*2+1;
            while(child<len){
                if((child+1)<len && elem[child+1]<elem[child]){
                    child++;
                }
                if(elem[child]<elem[parent]){
                    int tmp=elem[child];
                    elem[child]=elem[parent];
                    elem[parent]=tmp;
                    parent=child;
                    child=parent*2+1;
                }
                else {
                    break;
                }
            }
    }
    //堆排序（从大到小），建小堆
    public void heapsort2(int[]array){
            creatSmallHeap(array);
        for(int i=usedSize-1;i>=0;i--){
            int tmp=elem[i];
            elem[i]=elem[0];
            elem[0]=tmp;
            adjustdown2(0,i);
        }
    }
}
public class Test {
    public static void main(String[] args) {
        MyPriorityQueue  qu=new MyPriorityQueue();
        int[] array = {8,7,6,5,1,3};
       /* qu.creatBigHeap(array);
        qu.display();
        qu.push(9);
        qu.display();
        qu.poll();
        qu.display();
        System.out.println(qu.peek());*/
//        qu.heapsort(array);
//        qu.display();
        //qu.creatSmallHeap(array);
        qu.heapsort2(array);
        qu.display();
    }
    public static void main1(String[] args) {
       /* PriorityQueue<Integer>priorityQueue =new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });//优先级队列，默认是一个小根堆，修改比较器为大根堆
        priorityQueue.offer(10);
        priorityQueue.offer(3);
        priorityQueue.offer(13);
        priorityQueue.offer(10);
        priorityQueue.offer(9);
        System.out.println(priorityQueue.peek());*/
    }

}
