public class Test1 {
    //素数判断
    public static boolean prime(int num){
        int flag=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                flag=1;
            }
        }
        if(flag==1){
            return false;
        }
        return true;
    }
    public static boolean prime1(int num){
        int flag=0;
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                flag=1;
            }
        }
        if(flag==1){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(prime1(17));
    }
}
