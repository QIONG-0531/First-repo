import java.util.Arrays;

class Student implements Comparable{
    public  String name;
    public  int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student s=(Student)o;
        if (this.score>s.score){
            return -1;
        }
        else if(this.score<s.score){
            return 1;
        }
        else {
            return 0;
        }
    }
}


public class Test2 {
    public static void main(String[] args) {
        Student []student=new Student[]{
                new Student("小王",78),
                new Student("小张",89),
                new Student("小李",67)};
        Arrays.sort(student);
        System.out.println(Arrays.toString(student));
    }



}
