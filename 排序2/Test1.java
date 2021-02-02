import java.util.Arrays;
import java.util.Comparator;
//车队问题
class Car {
    int position;
    double time;
}
public class Test1 {
    public static int carFleet(int target, int[] position, int[] speed) {
        if (position.length == 1) return 1;
        Car[] cars = new Car[position.length];
        for (int i = 0; i < position.length; i++) {
            Car car = new Car();
            car.position = position[i];
            car.time = (target - position[i]) /(double) speed[i];
            cars[i] = car;
        }
        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.position-o2.position;
            }
        });
        int ret=cars.length;
        for(int i=cars.length-2;i>=0;i--){
            Car cur=cars[i];
            Car next=cars[i+1];
            if(cur.time<=next.time){
                ret--;
                cur.time=next.time;//追上前面的车，速度就与前车速度一样
            }
        }
        return ret;
    }

    public static void main(String[] args) {
       int  target = 12;
       int[]position = {10,8,0,5,3};
       int[]speed = {2,4,1,1,3};
        System.out.println(carFleet(target, position, speed));
    }
}
