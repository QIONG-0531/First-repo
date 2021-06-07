public class LTest168 {
    public String convertToTitle(int columnNumber) {
        if(columnNumber<=0) return "";
        StringBuilder sb=new StringBuilder();
        while(columnNumber!=0){
            // columnNumber--;
            sb.append((char)(columnNumber%26+'A'-1));
            columnNumber/=26;
        }
        return sb.reverse().toString();
    }
}
