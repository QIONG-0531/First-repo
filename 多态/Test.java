class Animal{
    public String name;
    public Animal(String name){
        this.name=name;
    }
    public void eat(){
        System.out.println(this.name+"动物正在吃");
    }
}
class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
    public void eat(){
        System.out.println(this.name+"猫正在吃");
    }
}
class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }
    public void fly(){
        System.out.println(this.name+"正在写");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal animal=new Cat("pop");
        animal.eat();
    }
}
