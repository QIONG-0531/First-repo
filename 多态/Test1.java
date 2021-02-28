import com.sun.scenario.effect.impl.sw.sse.SSEBlend_HARD_LIGHTPeer;
import sun.plugin.extension.RawExtensionInstaller;

abstract class Shape{
    abstract public void draw();
}
class Cycle extends Shape{
    @Override
    public void draw() {
        System.out.println("⭕");
    }
}
class Rect extends Shape{
    @Override
    public void draw() {
        System.out.println("▢");
    }
}
class Flower extends Shape{
    @Override
    public void draw() {
        System.out.println("❀");
    }
}
public class Test1 {
    public static void main(String[] args) {
        Shape shape1=new Cycle();
        Shape shape2=new Rect();
        Shape shape3=new Flower();
        shape1.draw();
        shape2.draw();
        shape3.draw();
    }

}
