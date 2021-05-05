import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Testz63 {
   /* private int count=0;
    private PriorityQueue<Integer> small =new PriorityQueue<>();
    private PriorityQueue<Integer> big=new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    });
    //奇数将前半段存放在大堆，前半段要比后半段多1，中位数就是大堆堆顶；
    // 偶数将前半段放在大堆，后半段放在小堆，两部分数量相同，中位数就是两个堆顶的和除2
    public void Insert(Integer num) {
       count++;
       //加一是奇数，要使大堆比小堆数多1，所以插入到大堆
       if(count%2!=0){
         if(!small.isEmpty() && num>small.peek()){
             small.offer(num);
             num=small.poll();
         }
         big.offer(num);
       }else{
           //加一是偶数，为了使大堆和小堆数量相同，应该插入到小堆
           if(!big.isEmpty() && num<big.peek()){
               big.offer(num);
               num=big.poll();
           }
           small.offer(num);
       }
    }

    public Double GetMedian() {

    }*/
    ArrayList<Integer> list=new ArrayList<>();
    public void Insert(Integer num) {
        if(list.size()==0){
            list.add(num);
            return;
        }
        int first=0;
        int last=list.size()-1;
        int mid=0;
        while(first<=last){
            mid=(first+last)/2;
            if(num>list.get(mid)){
                first=mid+1;
            }
            else{
                last=mid-1;
            }
        }
        list.add(first,num);
    }

    public Double GetMedian() {
        double ret=0;
        if(list.size()%2!=0){
            ret=(double)list.get(list.size()/2);
        }else{
            ret=(list.get(list.size()/2)+list.get(list.size()/2-1))/2.0;
        }
        return ret;
    }

}
