import java.util.Scanner;

public class Test5 {
    //模拟登录
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String passWord="123456";
        int time=0;
        while (time<3){
            String scan=scanner.nextLine();
            if(scan.equals(passWord)){
                System.out.println("登录成功");
                return;
            }else{
                System.out.println("密码错误");
                time++;
            }
        }
        System.out.println("登录失败");
    }
}
