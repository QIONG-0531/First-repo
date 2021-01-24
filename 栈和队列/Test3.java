import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Test3 {
        public ArrayList<Integer> asylum(int[][] ope) {
            if(ope==null){
                return null;
            }
            Queue<Integer> cat=new LinkedList<>();
            Queue<Integer> dog=new LinkedList<>();
            Queue<Integer> all=new LinkedList<>();
            ArrayList<Integer>arr=new ArrayList<>();
            for(int i=0;i<ope.length;i++){
                if(ope[i][0]==1){//有动物进收容所
                    if(ope[i][1]>0){//狗
                        dog.offer(ope[i][1]);
                        all.offer(ope[i][1]);
                    }
                    if(ope[i][1]<0){//猫
                        cat.offer(ope[i][1]);
                        all.offer(ope[i][1]);
                    }
                }
                if(ope[i][0]==2){//动物出
                    if(ope[i][1]==0){//先进来的先出
                        if(!all.isEmpty()){
                            arr.add(all.peek());
                            if(all.peek()>0){
                                dog.poll();
                            }
                            else{
                                cat.poll();
                            }
                            all.poll();
                        }
                    }
                    else{
                        if(ope[i][1]==1){//狗出
                            if(!dog.isEmpty()){
                                arr.add(dog.peek());
                                all.remove(dog.peek());
                                dog.poll();
                            }
                        }
                        else if(ope[i][1]==-1){//猫出
                            if(!cat.isEmpty()){
                                arr.add(cat.peek());
                               all.remove(cat.peek());
                               cat.poll();

                            }
                        }
                    }
                }
            }
            return arr;
        }
    }

