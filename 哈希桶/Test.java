
    import java.util.*;
    public class Test{
        //坏键盘
        public static void  broken(String strexp,String strfact){
            HashSet<Character> setfact=new HashSet<>();
            for(char ch:strfact.toUpperCase().toCharArray()){
                setfact.add(ch);
            }
            HashSet<Character> set=new HashSet<>();
            for(char ch:strexp.toUpperCase().toCharArray()){
                if(!setfact.contains(ch) && !set.contains(ch)){
                    set.add(ch);
                    System.out.print(ch);
                }
            }

        }
        public static void main(String args[]){
            Scanner scan=new Scanner(System.in);
            String strexp=scan.nextLine();
            String strfact=scan.nextLine();
            broken(strexp,strfact);
        }
    }


