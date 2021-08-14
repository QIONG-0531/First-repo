public class Demo58 {
    public int[] printNumbers(int n) {
        StringBuilder sb=new StringBuilder();
        while(n!=0){
            sb.append(9);
            n--;
        }
        int num=Integer.valueOf(sb.toString());
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=i+1;
        }
        return arr;

    }
}
