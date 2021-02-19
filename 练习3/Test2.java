import java.util.Arrays;

class MyArrayList{
    int usedSize;
    int[]elem;
    public MyArrayList() {
        this.elem=new int[4];
    }
    //打印顺序表
    public void display() {
        for(int i=0;i<usedSize;i++){
            System.out.print(elem[i]+" ");
        }
        System.out.println();
    }
    public boolean full(){
        return usedSize==elem.length;
    }
    public void resize(){
        this.elem= Arrays.copyOf(elem,2*elem.length);
    }
    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        if(full()) resize();
        if(pos<0 || pos>usedSize) return;
        for(int i=usedSize-1;i>=pos;i--){
            elem[i+1]=elem[i];
        }
        elem[pos]=data;
        usedSize++;
    }
    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for(int i=0;i<usedSize;i++){
            if(elem[i]==toFind){
                return true;
            }
        }
        return false;
    }
    // 查找某个元素对应的位置
    public int search(int toFind) {
        for(int i=0;i<usedSize;i++){
            if(elem[i]==toFind){
                return i;
            }
        }
        return -1;
    }
    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if(pos<0 || pos>usedSize) return -1;
        return elem[pos];
    }
    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        if(pos<0 || pos>usedSize) return;
        elem[pos]=value;
    }
    //删除第一次出现的关键字key
    public void remove(int key) {
        for(int i=0;i<usedSize;i++){
            if(elem[i]==key){
                for(int j=i+1;j<usedSize;j++){
                    elem[i]=elem[i-1];
                }
            }
        }
    }
    // 获取顺序表长度
    public int size() {
        return usedSize;
    }
    // 清空顺序表
    public void clear(){
        usedSize=0;
    }
}
public class Test2 {
    public static void main(String[] args) {
        MyArrayList myArrayList=new MyArrayList();
        myArrayList.add(0,10);
        myArrayList.add(1,11);
        myArrayList.add(2,12);
        myArrayList.add(3,13);
        myArrayList.add(4,14);
        myArrayList.display();
        System.out.println(myArrayList.contains(1));

    }
}
