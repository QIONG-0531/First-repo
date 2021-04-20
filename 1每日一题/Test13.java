import java.util.Scanner;

public class Test13 {
    //输出前k个最小的数
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
            String str=in.nextLine();
            String[]s=str.split("\\s+");
            int[]array=new int[s.length-1];
            for(int i=0;i<s.length-1;i++){
                array[i]=Integer.parseInt(s[i]);
            }
            int k=Integer.parseInt(s[s.length-1]);
            //建大堆
            createBigHeap(array);
            //将最大数交换到最后，然后下标为0的向下调整
            for(int i=array.length-1;i>0;i--){
                int tmp=array[0];
                array[0]=array[i];
                array[i]=tmp;
                adjustDown(array,0,i);
            }
            //输出前k个数
            int m=0;
            while(m<k){
                System.out.print(array[m]+" ");
                m++;
            }
        }
    }
    public static void createBigHeap(int[]array){
        for(int i=(array.length-1-1)/2;i>=0;i--){
            adjustDown(array,i,array.length);
        }
    }
    public static void adjustDown(int[]array,int parent,int len){
        int child=parent*2+1;
        while(child<len){
            if((child+1)<len && array[child+1]>array[child]){
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
}
