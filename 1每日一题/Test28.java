import java.util.Scanner;

public class Test28 {
    public static void main(String[]args) {
        String pai = "345678910JQKA2joker JOKER";
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            if (str.contains("joker JOKER")) {
                System.out.println("joker JOKER");
                return;
            }
            String[] nstr = str.split("\\-");
            String[] left = nstr[0].split("\\s");
            String[] right = nstr[1].split("\\s");
            if (left.length == 4 && right.length != 4) {
                System.out.println(nstr[0]);

            }
            else if (left.length != 4 && right.length == 4) {
                System.out.println(nstr[1]);

            }
            else if(left.length==right.length){
                if (pai.indexOf(left[0]) > pai.indexOf(right[0])) {
                    System.out.println(nstr[0]);
                }
                else if (pai.indexOf(left[0]) < pai.indexOf(right[0])) {
                    System.out.println(nstr[1]);
                }
            }
            else{
                System.out.println("ERROR");
            }
        }
    }
}
