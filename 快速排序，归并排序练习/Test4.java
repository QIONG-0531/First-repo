import java.util.Stack;

public class Test4 {
    //找基准
    public static int pivot(int[]array,int start,int end){
        int tmp=array[start];
        while(start<end){
            //先从end走
            while(start<end && array[end]>=tmp){
                end--;
            }
            if(start>=end){
                break;
            }else{
                array[start]=array[end];
            }
            //然后从start走
            while(start<end&& array[start]<=tmp){
                start++;
            }
            if(start>=end){
                break;
            }else{
                array[end]=array[start];
            }
        }
        array[start]=tmp;
        return start;
    }
    public static void quickSort(int[]array){
        Stack<Integer>stack=new Stack<>();
       int low=0;
       int high=array.length-1;
       int piv=pivot(array,low,high);
       if(piv>low+1){
           stack.push(low);
           stack.push(piv-1);
       }
       if(piv<high-1){
           stack.push(piv+1);
           stack.push(high);
       }
       while(!stack.isEmpty()){
           high=stack.pop();
           low=stack.pop();
           piv=pivot(array,low,high);
           if(piv>low+1){
               stack.push(low);
               stack.push(piv-1);
           }
           if(piv<high-1){
               stack.push(piv+1);
               stack.push(high);
           }
       }
    }
}
