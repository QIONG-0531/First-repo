public class Test1 {
    //比较版本号
    public int compareVersion(String version1, String version2) {
        String[]s1=version1.split("\\.");
        String[]s2=version2.split("\\.");
        int i=0;
        for(;i<s1.length && i<s2.length;i++){
            int num1=Integer.valueOf(s1[i]);
            int num2=Integer.valueOf(s2[i]);
            if(num1>num2){
                return 1;
            }
            if(num1<num2){
                return -1;
            }
        }
        if(s1.length>s2.length){
            for(;i<s1.length;i++){
                if(Integer.valueOf(s1[i])!=0){
                    return 1;
                }
            }
        }else{
            for(;i<s2.length;i++){
                if(Integer.valueOf(s2[i])!=0){
                    return -1;
                }
            }
        }
        return 0;
    }
}
