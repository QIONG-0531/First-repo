import java.security.cert.CertificateNotYetValidException;

class Shape{
    public void draw(){
    }
}
class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("⭕");
    }
}
class Rect extends Shape{
    @Override
    public void draw() {
        System.out.println("□");
    }
}
class Flower extends Shape{
    @Override
    public void draw() {
        System.out.println("❀");
    }
}
public class TestDemo {
    public static void drawShape(Shape shape){
        shape.draw();
    }
    public static void drawShapes(){
        Shape []shapes={new Cycle(),new Rect(),new Flower()};
        for (Shape shape:shapes) {
            shape.draw();
        }
    }

    public static void main(String[] args) {
        drawShapes();
    }
    public static void main1(String[] args) {
        Shape shape1=new Cycle();
        Shape shape2=new Rect();
        Shape shape3=new Flower();
        drawShape(shape1);
        drawShape(shape2);
        drawShape(shape3);
    }
}
