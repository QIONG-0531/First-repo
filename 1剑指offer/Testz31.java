public class Testz31 {
    //求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）
    public int NumberOf1Between1AndN_Solution(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            count+=sum(i);
        }
        return count;
    }
    /*public int sum(int i){
        int count=0;
        while(i!=0){
            int num=i%10;
            if(num==1){
                count++;
            }
            i=i/10;
        }
        return count;
    }*/
    public int sum(int i){
        int sum=0;
        String str=String.valueOf(i);
        for(char ch:str.toCharArray()){
            if(ch=='1'){
                sum++;
            }
        }
        return sum;
    }
}
