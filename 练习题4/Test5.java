import java.util.Arrays;

public class Test5 {
    //合并两个有序数组
    public static  void merge(int[] nums1, int m, int[] nums2, int n) {
        /*for (int i = m, j = 0; i < m + n && j < n; i++, j++) {
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);*/
        int[]copy=Arrays.copyOf(nums1,m);
        int p1=0;
        int p2=0;
        int k=0;
        while(p1<m && p2<n){
            if(copy[p1]<nums2[p2]){
                nums1[k++]=copy[p1++];
            }else{
                nums1[k++]=nums2[p2++];
            }
        }
        if(p1<m){
            while(p1<m){
                nums1[k++]=copy[p1++];
            }
        }
        if(p2<n){
            while(p2<n){
                nums1[k++]=nums2[p2++];
            }
        }

    }

    public static void main(String[] args) {
        int[]nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[]nums2 = {2,5,6};
        int n = 3;
        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));

    }
}
