package 三个接口;

import java.util.Arrays;
//Comparable比较器一般用在类内，用的是compareTo方法
class Student implements Comparable<Student>{
    public String name;
    public int score;

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
    public int compareTo(Student o) {
        if(this.score > o.score) {
            return 1;
        }else if(this.score == o.score) {
            return 0;
        }else {
            return -1;
        }
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Student []students=new Student[3];
        students[0]=new Student("aie",78);
        students[1]=new Student("cuo",34);
        students[2]=new Student("bit",90);
        System.out.println(students[2].compareTo(students[1]));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
