public class Test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.created();
        myLinkedList.display();
        /*Node ret=myLinkedList.findlast();
        System.out.println(ret.data);
        Node ret1=myLinkedList.findlasttwo();
        System.out.println(ret1.data);
        ret= myLinkedList.findx(2);
        System.out.println(ret.data);
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.find(89));
        myLinkedList.firstnode(12);
        myLinkedList.display();
        myLinkedList.lastnode(89);
        myLinkedList.display();*/
        /*myLinkedList.add(0,99);
        myLinkedList.display();
        myLinkedList.add(6,99);
        myLinkedList.display();
        myLinkedList.add(2,49);
        myLinkedList.display();*/
        //System.out.println(myLinkedList.reverse().data);
        System.out.println(myLinkedList.midNode().data);
    }
}
