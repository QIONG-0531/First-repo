import java.util.Arrays;

public class Test {
    //Arrays.deepToString
    public static void main(String[] args) {
        int[][]arr={{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(arr));
    }
    //foreach打印
    public static void main2(String[] args) {
        int[][]arr={{1,2,3},{4,5,6}};
        for (int[]array:arr) {
            for (int x:array) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    //二维数组循环打印
    public static void main1(String[] args) {
        int[][]arr={{1,2,3},{4,5,6}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

