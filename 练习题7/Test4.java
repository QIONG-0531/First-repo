public class Test4 {
    //水仙花
    public static void waterFlower(int num){
        //输入的数字是几位数
        int tmp=num;
        int count=0;
        while(tmp!=0){
            count++;
            tmp=tmp/10;
        }
        //计算次方之和
        tmp=num;
        double sum=0;
        while(tmp!=0){
            sum=sum+Math.pow(tmp%10,count);
           tmp=tmp/10;
        }
        //比较是否相等
        if(sum==num){
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        for(int i=0;i<1000;i++){
            waterFlower(i);
        }
    }
}
