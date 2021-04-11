import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Testz40 {
    //一个整型数组里除了两个数字只出现一次，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字
    public int[] FindNumsAppearOnce (int[] array) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:array){
            if(!map.containsKey(x)){
                map.put(x,1);
            }else{
                int count=map.get(x);
                map.put(x,count+1);
            }
        }
        int[]num=new int[2];
        int i=0;
        for(int x:array){
            if(map.get(x)==1){
                num[i++]=x;
            }
        }
        return num;
    }
    public int[] FindNumsAppearOnce1 (int[] array){
        HashSet<Integer> set=new HashSet<>();
        for(int x:array){
            if(set.contains(x)){
                set.remove(x);
            }else{
                set.add(x);
            }
        }
        int []num=new int[2];
        int i=0;
        for(int x:set){
            num[i++]=x;
        }
        return num;
    }
    public void swap(int[] array,int a,int b){
        int tmp=array[a];
        array[a]=array[b];
        array[b]=tmp;
    }
    public int[] FindNumsAppearOnce2 (int[] array) {
        int[]a=new int[2];
        int n=array[0];
        for(int i=1;i<array.length;i++){
            n^=array[i];//有两个数字只出现一次，说明数组异或结果就是单独出现的数字异或的结果，相同的数字异或抵消了
        }
        int m=1;
        while((m&n)==0){//找出异或结果的二进制中最高位的1
            m=m<<1;
        }
        for(int x:array){//根据最高位的1将数组分成两部分，只出现一次的两个数一定被分开了
            if((m&x)==0){
                a[0]^=x;//异或得到第一个只出现一次的数
            }else{
                a[1]^=x;//异或得到第二个只出现一次的数
            }
        }
        if(a[0]>a[1]){//第一个数字要小于第二个数字
            swap(a,0,1);
        }
        return a;
    }
    public static void main(String[] args) {
        int[]array={1,4,1,2};
        System.out.println(Arrays.toString(FindNumsAppearOnce2(array)));

    }
}
