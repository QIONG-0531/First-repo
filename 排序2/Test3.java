import java.util.Arrays;
//归并排序（分解再合成）
public class Test3 {
    public static  void meger(int[]array,int low,int mid,int high){
        int s1=low;
        int s2=mid+1;
        int[] tmp=new int[high-low+1];
        int k=0;
        while(s1<=mid && s2<=high){
            if(array[s1]<array[s2]){
                tmp[k++]=array[s1++];
            }else{
                tmp[k++]=array[s2++];
            }
        }
        while(s1<=mid){
            tmp[k++]=array[s1++];
        }
        while(s2<=high){
            tmp[k++]=array[s2++];
        }
        for(int i=0;i<tmp.length;i++){
            array[i+low]=tmp[i];
        }
    }
    public static  void megersortInternal(int[]array,int low,int high){
        if(low>=high) return;
        int mid=(high+low)/2;
        megersortInternal(array,low,mid);
        megersortInternal(array,mid+1,high);
        meger(array,low,mid,high);
    }
    public static  void megerSort(int[]array){
        megersortInternal(array,0,array.length-1);
    }

    public static void main(String[] args) {
        int[]array={23,12,34,54,37};
        megerSort(array);
        System.out.println(Arrays.toString(array));
    }
}
