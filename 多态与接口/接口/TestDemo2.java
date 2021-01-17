package 接口;
interface IFlying{
    void fly();
}
interface IRunning{
    void run();
}
interface ISwimming{
    void swim();
}
class Animal{
    String name;

    public Animal(String name) {
        this.name = name;
    }
}
class Cat extends Animal implements IRunning{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name+"正在跑");
    }
}
class Fish extends Animal implements ISwimming{
    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(this.name+"正在游");
    }
}
class Duck extends Animal implements ISwimming,IRunning,IFlying{
    public Duck(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(this.name+"正在游");
    }

    @Override
    public void run() {
        System.out.println(this.name+"正在跑");
    }

    @Override
    public void fly() {
        System.out.println(this.name+"正在飞");
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        IRunning iRunning=new Cat("猫猫");
        iRunning.run();
        IFlying iFlying=new Duck("鸭子");
        iFlying.fly();
        ISwimming iSwimming=new Duck("鸭子");
        iSwimming.swim();
    }
}
