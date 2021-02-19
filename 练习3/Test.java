class Calculactor{
    public  int add(int num1, int num2){
        return num1+num2;
    }
    public  double add(double num1,double num2){
        return num1+num2;
    }
    public  int sub(int num1,int num2){
        return num1-num2;
    }
    public double sub(double num1,double num2){
        return num1-num2;
    }
    public int mul(int num1,int num2){
        return num1*num2;
    }
    public double mul(double num1,double num2){
        return num1*num2;
    }
    public int div(int num1,int num2){
        return num1/num2;
    }
    public double div(double num1,double num2){
        return num1/num2;
    }
}
public class Test {
    public static void main(String[] args) {
        Calculactor cal=new Calculactor();
        System.out.println(cal.add(10, 20));
    }

}
