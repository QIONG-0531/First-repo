import java.util.Arrays;
//归并排序
public class Test5 {
    public static void meger(int[]array,int low,int mid,int high){
        int s1=low;
        int e1=mid;
        int s2=mid+1;
        int e2=high;
        int[]tmp=new int[high-low+1];
        int k=0;
        while(s1<=e1 && s2<=e2){
            if(array[s1]<array[s2]){
                tmp[k++]=array[s1++];
            }else{
                tmp[k++]=array[s2++];
            }
        }
        while(s1<=e1){
            tmp[k++]=array[s1++];
        }
        while(s2<=e2){
            tmp[k++]=array[s2++];
        }
        for(int i=0;i<tmp.length;i++){
            array[i+low]=tmp[i];//可能合并的是右边的
        }
    }
    public static void megerChild(int[]array,int low,int high){
        if(low>=high) return;
        int mid=(low+high)/2;
        megerChild(array,low,mid);
        megerChild(array,mid+1,high);//先分解
        meger(array,low,mid,high);//再合并
    }
    public static void megerSort(int[]array){
           megerChild(array,0,array.length-1);
    }
    public static void main(String[] args) {
        int[]array={3,2,4,6,1,6,8};
        megerSort(array);
        System.out.println(Arrays.toString(array));
    }
}
