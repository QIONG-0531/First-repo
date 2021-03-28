import java.util.*;
    public class Test4{
        //坏键盘打字
        public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            String str=scanner.nextLine();
            String fact=scanner.nextLine();
            broken(str,fact);
        }
        public static void broken(String str,String fact){
            str=str.toUpperCase();
            fact=fact.toUpperCase();
            HashSet<Character>fset=new HashSet<>();
            for(char ch:fact.toCharArray()){
                fset.add(ch);
            }
            HashSet<Character>set=new HashSet<>();
            for(char ch:str.toCharArray()){
                if(!fset.contains(ch)&& !set.contains(ch)){
                    set.add(ch);
                    System.out.print(ch);//按添加顺序打印，HashSet存储不是按顺序来的
                }
            }
        }
    }

