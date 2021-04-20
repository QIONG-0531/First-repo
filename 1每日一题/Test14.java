import java.util.ArrayList;
import java.util.Scanner;

public class Test14 {
    //每隔两个数删掉一个数，返回最后删除的数的下标
    //用list模拟循环链表
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            while(in.hasNextInt()){
                int n=in.nextInt();
                if(n>1000) n=999;
                int[]array=new int[n];
                ArrayList<Integer>list=new ArrayList<>();
                for(int i=0;i<array.length;i++){
                    array[i]=i;
                    list.add(array[i]);
                }
                int cur=0;
                while(list.size()>1){
                    cur=(cur+2)%list.size();//用cur代表当前要删除的数的下标
                    list.remove(cur);
                }
                System.out.println(list.get(0));
            }
        }
}
