import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Demo42 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            String[]s=str.split(" ");
            int[]num=new int[s.length-1];
            for(int i=0;i<num.length;i++){
                num[i]=Integer.parseInt(s[i]);
            }
            int k=Integer.parseInt(s[s.length-1]);
            String ret=paixu(num,k);
            System.out.println(ret);
        }
    }
    public static String paixu(int[]num,int k){
        PriorityQueue<Integer> queue=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 02-01;
            }
        });
        for(int i=0;i<num.length;i++){
            if(i<k){
                queue.offer(num[i]);
            }else{
                int tmp=queue.peek();
                if(num[i]<tmp){
                    queue.poll();
                    queue.offer(num[i]);
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        while(queue.size()>1){
            sb.append(queue.poll()+" ");
        }
        sb.append(queue.poll());
        return sb.toString();
    }
}
