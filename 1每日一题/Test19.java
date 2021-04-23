public class Test19 {
    public int getLCA(int a, int b) {
        int max=Math.max(a,b);
        int min=Math.min(a,b);
        for(int i=min;i>0;i/=2){
            for(int j=max;j>0;j/=2){
                if(i==j){
                    return i;
                }
            }
        }
        return -1;
    }
}
