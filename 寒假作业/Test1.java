import java.util.LinkedList;

public class Test1 {
    //转换成小写字母（用数组）
    public String toLowerCase(String str) {
        if(str==null) return null;
        char[]chars=str.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(chars[i]>='A' && chars[i]<='Z'){
                chars[i]=(char)((int)chars[i]+'a'-'A');
            }
        }
        return new String(chars);
    }
    //给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
    public void rotate(int[] nums, int k) {
        /*k=k%nums.length;
        int[]tmp=new int[k];
        int n=0;
        for(int i=nums.length-k;i<nums.length;i++){
            tmp[n++]=nums[i];
        }
        for(int i=nums.length-k-1;i>=0;i--){
            nums[i+k]=nums[i];
        }
        for(int i=0;i<k;i++){
            nums[i]=tmp[i];
        }*/

        /*while(k!=0){
            int tmp=nums[nums.length-1];
            for(int i=nums.length-1-1;i>=0;i--){
                nums[i+1]=nums[i];
            }
            nums[0]=tmp;
            k--;
        }*/

        LinkedList<Integer> list=new LinkedList<>();
        for(int x:nums){
            list.add(x);
        }
        while(k!=0){
            list.addFirst(list.removeLast());
            k--;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=list.removeFirst();
        }
    }
}
