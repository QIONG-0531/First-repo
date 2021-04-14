
import java.util.ArrayList;
import java.util.Scanner;

public class Test5{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        ArrayList<ArrayList<Character>>ret=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                ArrayList<Character>list=new ArrayList<>();
                list.add(str.charAt(i));
                for(int j=i+1;j<str.length();j++){
                    if(str.charAt(j)==(char)((int)str.charAt(j-1)+1)){
                        list.add(str.charAt(j));
                    }else{
                        break;
                    }
                }
                ret.add(list);
            }
        }
        int length=ret.get(0).size();
        int n=0;
        for(int i=1;i<ret.size();i++){
            if(ret.get(i).size()>length){
                length=ret.get(i).size();
                n=i;
            }
        }
        char[]chars=new char[length];
        int i=0;
        for(char ch:ret.get(n)) {
            chars[i++] = ch;
        }
        System.out.println(new String(chars));
    }
}
