import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        if(numRows <= 0) return ret;
        //第一行的list
        List<Integer> list = new ArrayList<>();
        list.add(1);
        //把第一行的list放到ret当中
        ret.add(list);
        for(int i = 1;i < numRows;i++) {
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);
            for(int j = 1 ;j < i;j++) {
                //确定的是当前行的每个元素  ==  上一行的当前列+上一行的前一列就是我当前需要添加的数字
                List<Integer>  prevRows=ret.get(i-1);
                int num=prevRows.get(j-1)+prevRows.get(j);
                curRow.add(num);
            }
            //手动在当前行的最后一个位置 添加一个1
            curRow.add(1);
            ret.add(curRow);
        }
        return ret;
    }
}
