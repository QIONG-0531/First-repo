public class Test5 {
    //给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。
    public boolean repeatedSubstringPattern(String s) {
        for(int i=1;i<s.length();i++){
            if(s.length()%i==0){
                boolean flag=true;
                for(int j=i;j<s.length();j++){
                    if(s.charAt(j)!=s.charAt(j-i)){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    return true;
                }
            }
        }
        return false;
    }
}
