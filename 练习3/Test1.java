class Person{
    public int age;
    public String name;

    public Person() {
        System.out.println("构造方法");
    }
    {
        System.out.println("实例代码块");
    }
    static {
        System.out.println("静态代码块");
    }
}
public class Test1 {
    public static void main(String[] args) {
        Person person1=new Person();//先静态代码块，再实例代码块，再构造方法，静态代码块只执行一次
        System.out.println();
        Person person2=new Person();
    }
}
