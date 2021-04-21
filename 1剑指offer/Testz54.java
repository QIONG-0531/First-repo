import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Testz54 {
    HashMap<Character,Integer> map=new HashMap<>();
    Queue<Character> queue=new LinkedList<>();
    public void Insert(char ch)
    {
        if(!map.containsKey(ch)){
            map.put(ch,1);
            queue.offer(ch);
        }else{
            int count=map.get(ch);
            map.put(ch,count+1);
        }
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        if(queue.isEmpty()){
            return '#';
        }
        char ch=queue.peek();
        while(map.get(ch)!=1){
            if(queue.isEmpty()){
                return '#';
            }
            ch=queue.poll();
        }
        return ch;
    }
}
