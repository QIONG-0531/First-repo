import netscape.security.UserTarget;
import sun.awt.image.ImageWatched;

import java.util.*;

public class Test5 {
    //前k个高频单词
    public static List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(String str:words){
            if(!map.containsKey(str)){
                map.put(str,1);
            }else{
                int count=map.get(str);
                map.put(str,count+1);
            }
        }
        PriorityQueue<String>heap=new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(map.get(o1).equals(map.get(o2))){
                    return o2.compareTo(o1);
                }else {
                    return map.get(o1) - map.get(o2);
                }
            }
        });
        for(String str:map.keySet()){
            heap.offer(str);
            if(heap.size()>k){
                heap.poll();
            }
        }
       LinkedList<String> list=new LinkedList<>();
        while(!heap.isEmpty()){
            list.addFirst(heap.poll());
        }
        return list;
    }

    public static void main(String[] args) {
        String[]words= {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        System.out.println(topKFrequent(words,k));
    }
}

