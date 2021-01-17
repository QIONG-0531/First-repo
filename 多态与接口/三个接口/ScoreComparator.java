package 三个接口;

import java.util.Comparator;

public  class  ScoreComparator  implements Comparator<Student2>{
    @Override
    public int compare(Student2 o1, Student2 o2) {
        return o1.score-o2.score;
    }
}