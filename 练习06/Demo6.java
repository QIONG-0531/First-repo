public class Demo6 {
    public int titleToNumber(String columnTitle) {
        int ret=0;
        char[]ch=columnTitle.toCharArray();
        int i=0;
        int k=ch.length-1;
        while(i<ch.length){
            ret+=Math.pow(26,k)*(ch[i]-'A'+1);
            i++;
            k--;
        }
        return ret;
    }
}

