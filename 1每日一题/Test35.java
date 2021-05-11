import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Test35 {
    public static HashMap<String,Integer> table(boolean year){
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=1;i<=12;i++){
            if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12){
                map.put(String.valueOf(i),31);
            }else if(i==2) {
                if (year) {
                    map.put(String.valueOf(i), 29);
                } else {
                    map.put(String.valueOf(i), 28);
                }
            }else{
                map.put(String.valueOf(i), 30);
            }
        }
        return map;
    }
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String str=in.nextLine();
            String[]date=str.split(" ");
            int year=Integer.parseInt(date[0]);
            int month=Integer.parseInt(date[1]);
            int day=Integer.parseInt(date[2]);
            boolean flag=false;
            if((year%4==0 && year%100!=0) || year%400==0){
                flag=true;
            }
            HashMap<String,Integer> map=new HashMap<>();
            map=table(flag);
            int sum=0;
            for(int i=1;i<month;i++){
                sum+=map.get(String.valueOf(i));
            }
            System.out.println(sum+day);
        }
    }
}


