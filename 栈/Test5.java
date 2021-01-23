class A<T> {
    T value;

    A(T value) {
        this.value=value;
    }

    T get() {
        return value;
    }
}
public class Test5 {
    public static void main(String[] args) {
        A<Integer>a=new A<>(1);
        System.out.println(a.get());
        A<String>a2=new A<>("ADV");
        System.out.println(a2.get());
    }
}
