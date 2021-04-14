import java.util.ArrayList;

public class Test41 {
    //输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> ret=new ArrayList<>();
        int tmp=sum;
        for(int i=1;i<=(sum/2)+1;i++){
            ArrayList<Integer>list=new ArrayList<>();
            list.add(i);
            tmp=tmp-i;
            for(int j=i+1;j<=(sum/2)+1;j++){
                if(tmp>=j){
                    list.add(j);
                    tmp=tmp-j;
                }else{
                    break;
                }
            }
            if(tmp==0&&list.size()>1){
                ret.add(list);
            }
            tmp=sum;
        }
        return ret;
    }
}
