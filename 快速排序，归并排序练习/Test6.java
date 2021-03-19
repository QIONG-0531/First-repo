import java.util.Arrays;
//非递归实现归并排序，就是分组实现有序，分组合并两个有序数组
public class Test6 {
    public static  void meger(int[]array,int gap){
        int s1=0;
        int e1=s1+gap-1;
        int s2=e1+1;//必须保证有两个归并段
        int e2=s2+gap-1<array.length?s2+gap-1:array.length-1;
        int[]tmp = new int[array.length];
        int k=0;
        while(s2<array.length){
            while(s1<=e1 && s2<=e2){
                if(array[s1]<array[s2]){
                    tmp[k++]=array[s1++];
                }else{
                    tmp[k++]=array[s2++];
                }
            }
            while (s1<=e1){
                tmp[k++]=array[s1++];
            }
            while (s2<=e2){
                tmp[k++]=array[s2++];
            }
            s1=e2+1;
            e1=s1+gap-1;
            s2=e1+1;
            e2=s2+gap-1<array.length?s2+gap-1:array.length-1;
        }
        //退出循环后，将s1这个段整体拷贝下来，但是e1可能已经越界了
        while(s1<array.length){
            tmp[k++]=array[s1++];
        }
        for(int i=0;i<array.length;i++){
            array[i]=tmp[i];
        }
    }
    public static  void megerSort(int[]array){
        for(int i=1;i<array.length;i*=2){
            meger(array,i);
        }
    }
    public static void main(String[] args) {
        int[]array={3,2,4,6,1,6,8};
        megerSort(array);
        System.out.println(Arrays.toString(array));
    }
}
