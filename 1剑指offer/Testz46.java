import java.util.ArrayList;

public class Testz46 {
    //圆圈中最后剩下的数   用list模拟循环链表
    public int LastRemaining_Solution(int n, int m) {
        if(m<0 || n<0) return -1;
        if(m==0 && n==0) return -1;
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(i);
        }
        int cur=0;
        while(list.size()>1){
            cur=(cur+m-1)%list.size();
            list.remove(cur);
        }
        return list.get(0);
    }
}
