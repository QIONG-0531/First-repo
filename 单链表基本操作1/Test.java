public class Test {
    public static void main(String[] args) {
       MyArrayList myArrayList=new MyArrayList();
        myArrayList.add(0,1);
        myArrayList.add(1,2);
        myArrayList.add(2,3);
        myArrayList.add(3,4);
        myArrayList.add(4,4);
        myArrayList.add(5,4);
        myArrayList.add(6,4);
        myArrayList.display();
        System.out.println(myArrayList.contains(5));
        System.out.println(myArrayList.search(2));
        System.out.println(myArrayList.getPos(3));
        myArrayList.setPos(0,99);
        myArrayList.display();
        myArrayList.remove(99);
        myArrayList.display();
        System.out.println(myArrayList.size());
        System.out.println("=========");
        myArrayList.clear();
        myArrayList.display();
    }
}
