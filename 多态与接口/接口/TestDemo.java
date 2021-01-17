package 接口;
interface IShape{
    void draw();//接口当中的方法，不能有具体的实现
    public static final int age=10;//成员变量默认public static final
   // public abstract void run();//接口当中的方法默认是public abstract
    default void fly(){
        System.out.println("fly");//default修饰的方法可以有具体实现
    }
}
interface A{

}
interface B{

}
interface C{

}
class E implements A,B,C{//一个类可以实现多个接口

}
class D{

}
interface F extends A,B,C{//接口可以扩展多个接口

}
class G extends D implements  A,B,C{//一个类只能继承一个类同时实现多个接口

}
class Cycle implements IShape{
    @Override
    public void draw() {
        System.out.println("⭕");
    }
}

public class TestDemo {
    public static void main(String[] args) {
        //IShape shape=new IShape() ;接口不能进行实例化
    }
}
