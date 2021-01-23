import java.util.ArrayList;

class MyArrayList<T>{
    public T[] elem;
    public int usedSize;

    public MyArrayList( ) {
        //this.elem=new T[10];//不能new泛型类型的数组
        this.elem=(T[])new Object[10];
    }
    public void add(T data){
        this.elem[usedSize]=data;
        usedSize++;
    }
    public T get(int index){
        return elem[index];
    }
}
public class TestDemo {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList1=new MyArrayList<>();
        myArrayList1.add("abc");
        MyArrayList<Integer> myArrayList2=new MyArrayList<>();
        myArrayList2.add(4);
        MyArrayList myArrayList=new MyArrayList();
        myArrayList.add(1);
        myArrayList.add("adc");
    }



}
