import java.util.Arrays;

public class LTest88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<n;i++){
            nums1[m+i]=nums2[i];
        }
        for(int i=1;i<nums1.length;i++){
            int tmp=nums1[i];
            int j=i-1;
            for(;j>=0;j--){
                if(nums1[j]>tmp){
                    nums1[j+1]=nums1[j];
                }else{
                    break;
                }
            }
            nums1[j+1]=tmp;
        }
    }

    public static void main(String[] args) {
        int[]nums1 = {4,5,6,0,0,0};
        int m = 3;
        int []nums2 = {1,2,3};
        int n = 3;
        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }
}
