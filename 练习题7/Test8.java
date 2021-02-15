import java.util.Arrays;

public class Test8 {
    public static int[] searchRange(int[] nums, int target) {
        int[]search=new int[2];
        search[0]=findfirst(nums,target);
        search[1]=findlast(nums,target);
        return search;
    }
    public static int findfirst(int[]nums,int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target==nums[mid] &&(mid-1<0 ||nums[mid-1]!=target)){
                return mid;
            }else if(target<=nums[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static int findlast(int[]nums,int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target==nums[mid] &&(mid+1>=nums.length ||nums[mid+1]!=target)){
                return mid;
            }else if(target<nums[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]array={3,3,3};
        int target=3;
        System.out.println(Arrays.toString(searchRange(array,target)));
    }
}
