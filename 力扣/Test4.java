import java.util.HashMap;

public class Test4 {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int i=0;
        int sum=0;
        while(i<s.length()){
            if((i+1)<s.length()){
                if((s.charAt(i)=='I' &&(s.charAt(i+1)=='V' ||s.charAt(i+1)=='X')) ||
                        (s.charAt(i)=='X' &&(s.charAt(i+1)=='L' ||s.charAt(i+1)=='C')) ||
                        (s.charAt(i)=='C' &&(s.charAt(i+1)=='D' ||s.charAt(i+1)=='M'))){
                    i+=2;
                    sum+=map.get(s.charAt(i+1))-map.get(s.charAt(i));
                }
            }
        }
    }
}
