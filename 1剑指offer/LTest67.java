public class LTest67 {
    public String addBinary(String a, String b) {
        int add=0;
        StringBuilder sb=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        while(i>=0 || j>=0){
            if(i>=0)  add+=a.charAt(i)-'0';
            if(j>=0)  add+=b.charAt(j)-'0';
            sb.append(add%2);
            add=add/2;
            i--;
            j--;
        }
        if(add!=0) sb.append(add);
        sb=sb.reverse();
        return sb.toString();
    }
}
