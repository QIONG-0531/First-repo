
import java.util.Scanner;
//自定义异常
class UserExcepation extends Exception{
    public UserExcepation(String message) {
        super(message);
    }
}
class PassExcepation extends Exception{
    public PassExcepation(String message) {
        super(message);
    }
}
public class TestDemo {
    //用户登录
    private static String userName="bit";
    private static String passWord="123456";
    public static void login1(String useName,String passWord){
        if(!TestDemo.userName.equals(useName)){
            try{
                throw new UserExcepation("用户名错误");
            }catch(UserExcepation userExcepation){
                userExcepation.printStackTrace();
            }
        }
        if(!TestDemo.passWord.equals(passWord)){
            try{
                throw new PassExcepation("密码错误");
            }catch(PassExcepation passExcepation){
                passExcepation.printStackTrace();
            }
        }
        System.out.println("登录成功");
    }

    public static void main(String[] args) {
        login1("wq","123456");
    }
    public static void login(String useName,String passWord)throws UserExcepation,PassExcepation{
             if(!TestDemo.userName.equals(useName)){
                 throw new UserExcepation("用户名错误");
             }
             if(!TestDemo.passWord.equals(passWord)){
                 throw new PassExcepation("密码错误");
             }
        System.out.println("登录成功");
    }
    public static void main4(String[] args) {
        try{
            login("bit","123456");
        }catch(UserExcepation userExcepation){
            userExcepation.printStackTrace();
        }catch(PassExcepation passExcepation){
            passExcepation.printStackTrace();
        }
    }
    public static void func2(){
        int []arr={1,2,3};
        try{
            System.out.println(arr[100]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
    public static void main3(String[] args) {
        func2();
        System.out.println("捕获");
    }
    public static void func1(){
        int []arr={1,12,3};
        System.out.println(arr[100]);//方法中没有处理异常方式，就会沿着调用栈向上传递
    }
    public static void main2(String[] args) {
        try{
            func1();
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("捕获");
    }
    public static void main1(String[] args) {
        //将scanner在try()中创建，能够保证在try执行完
         //       以后自动调用scanner的close方法
        /*try(Scanner scanner=new Scanner(System.in)){
            int num=scanner.nextInt();
            System.out.println("num="+num);
        } catch(Exception e){
            e.printStackTrace();
        }*/
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        try{
            System.out.println("num="+num);
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            scanner.close();
        }
    }
}
