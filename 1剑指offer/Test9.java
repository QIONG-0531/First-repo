public class Test9 {
    //在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
    // 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
    public boolean Find(int target, int [][] array) {
        for(int i=0;i<array.length;i++){
            int left=0;
            int right=array[0].length-1;//将二维数组看成多个一维数组，每个一维数组进行二分查找（因为每个一维数组是有序的）
            while(left<=right){
                int mid=(left+right)/2;
                if(array[i][mid]<target){
                    left=mid+1;
                }
                else if(array[i][mid]>target){
                    right=mid-1;
                }
                else{
                    return true;
                }
            }
        }
        return false;
    }
    //请实现一个函数，将一个字符串中的每个空格替换成“%20”。
    // 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
    public String replaceSpace (String s) {
        char[]chars=s.toCharArray();
        StringBuilder  sb=new StringBuilder();
        for(int i=0;i<chars.length;i++){
            if(chars[i]==' '){
                sb.append("%20");
            }
            else{
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }
    public String replaceSpace1 (String s) {
       return s.replaceAll(" ","%20");

    }
    }

}
