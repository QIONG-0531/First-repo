import java.util.Arrays;

class Person{
        private int age;//封装
        public String name;
        public static int count=10;
        public void eat(){
            System.out.println("吃饭");
        }
        public void sleep(){
            System.out.println("睡觉");
        }
        public static void drink(){
            System.out.println("喝水");
        }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override//toString重写
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
    {
        System.out.println("实例代码块");
    }
    static {
        System.out.println("静态代码块");
    }
}
    public class Test{
        public static void main(String[] args) {
            Person person1=new Person();
            System.out.println("===========");
            Person person2=new Person();
           /* person.age=10;
            person.name="bit";*/
           /* person.eat();
            person.sleep();*/
           /* person.setAge(20);
            int age=person.getAge();
            System.out.println(age);
            System.out.println(person.name);*/
            /*Person.drink();
            System.out.println(Person.count);*/
            //System.out.println(person);//打印最底层调用的是Object的toString方法
        }
        //给定两个整型数组, 交换两个数组的内容.
        public static void swap(int[]arr1,int[]arr2){
            for(int i=0;i<arr1.length;i++){
                int tmp=arr1[i];
                arr1[i]=arr2[i];
                arr2[i]=tmp;
            }
        }
        public static void main1(String[] args) {
          int[]arr1={1,2,3,4};
          int[]arr2={5,6,7,8};
          swap(arr1,arr2);
            System.out.println(Arrays.toString(arr1));
            System.out.println(Arrays.toString(arr2));
        }
    }

