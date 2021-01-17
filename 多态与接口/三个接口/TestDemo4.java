package 三个接口;
class Money implements Cloneable{
    public double money=12.8;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person implements Cloneable{
    public  String name;
    Money m=new Money();

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person person2 = (Person)super.clone();
        person2.m = (Money) this.m.clone();
        return person2;//深拷贝
       // return super.clone();浅拷贝
    }
}
public class TestDemo4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person("abc");
        Person person2 = (Person) person1.clone();
        person2.m.money=99;
        System.out.println(person1.m.money);
        System.out.println(person2.m.money);
    }
}
