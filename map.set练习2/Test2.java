import org.omg.CORBA.INTERNAL;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

public class Test2 {
    //找到第一个重复的数字
    public static int findfirstrepeat(){
        ArrayList<Integer>list=new ArrayList<>();
        Random random=new Random();
        for(int i=0;i<10000;i++){
            list.add(random.nextInt(10000));
        }
        HashSet<Integer>set=new HashSet<>();
        for(int x:list){
            if(!set.contains(x)){
                set.add(x);
            }else{
                return x;
            }
        }
        return -1;
    }
    //去重
    public static Set<Integer> deputil(){
        ArrayList<Integer>list=new ArrayList<>();
        Random random=new Random();
        for(int i=0;i<10000;i++){
            list.add(random.nextInt(10000));
        }
        HashSet<Integer>set=new HashSet<>();
         for(int x:list){
             set.add(x);
         }
         return set;
    }
    //统计次数
    public static void count(){
        ArrayList<Integer>list=new ArrayList<>();
        Random random=new Random();
        for(int i=0;i<10000;i++){
            list.add(random.nextInt(10000));
        }
        HashMap<Integer,Integer>map=new HashMap<>();
//        for(int x:list){
//            if(!map.containsKey(x)){
//                map.put(x,1);
//            }else{
//                Integer sum=map.get(x);
//                map.put(x,sum++);
//            }
//        }
//        for(int x:list){
//            if(map.get(x)>1){
//                System.out.println(x+"="+map.get(x));
//            }
//        }
        for(int i=0;i<list.size();i++){
            Integer num=list.get(i);
            if(map.get(num)==null){
                map.put(num,1);
            }else{
                Integer count=map.get(num);
                map.put(num,count+1);
            }
        }
        /*for(int i=0;i<list.size();i++){
            Integer num=list.get(i);
            if(map.get(num)>1){
                System.out.println(num+"="+map.get(num));
            }
        }*/
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+"="+entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(findfirstrepeat());
        System.out.println(deputil());
        count();
    }
}
