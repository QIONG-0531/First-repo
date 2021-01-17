package 抽象类;

abstract class Shape{
    abstract public void draw();//抽象方法不能有具体的实现
    int age;
    public void func(){
        System.out.println("func");
    }

}
class Cycle extends Shape{
    @Override//普通类继承抽象类，一定要重写抽象类的抽象方法
    public void draw() {

    }
}
 abstract class Rect extends Shape{//普通类继承抽象类，不想重写抽象类的抽象方法时，将普通类改为抽象类

}
public class TestDemo {
    public static void main(String[] args) {
        //Shape shape=new Shape() ;抽象类不能直接实例化
            }
        }