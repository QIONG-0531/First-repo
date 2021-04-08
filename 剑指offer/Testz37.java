public class Testz37 {
    //统计一个数字在升序数组中出现的次数。(升序首先想到二分查找）
    public int GetNumberOfK(int [] array , int k) {
        int left=0;
        int right=array.length-1;
        int firstK=getfirst(array,k,left,right);//找左边界
        int lastK=getlast(array,k,left,right);//找右边界
        if(firstK!=-1 && lastK!=-1){
            return lastK-firstK+1;
        }
        return 0;
    }
    public int getfirst(int[]array,int k,int left,int right){
        while(left<=right){
            int mid=(left+right)/2;
            if(k>array[mid]){
                left=mid+1;
            }
            if(k<array[mid]){
                right=mid-1;
            }
            if(k==array[mid]){
                if((mid-1)>=0 && array[mid-1]==k){
                    right=mid-1;
                }else{
                    return mid;
                }
            }
        }
        return -1;
    }
    public int getlast(int[]array,int k,int left,int right){
        while(left<=right){
            int mid=(left+right)/2;
            if(k>array[mid]){
                left=mid+1;
            }
            if(k<array[mid]){
                right=mid-1;
            }
            if(k==array[mid]){
                if((mid+1)<array.length && array[mid+1]==k){
                    left=mid+1;
                }else{
                    return mid;
                }
            }
        }
        return -1;
    }
}

