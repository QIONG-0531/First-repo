public class TestDemo {
    /*在一个小镇里，按从 1 到 N 标记了 N 个人。传言称，这些人中有一个是小镇上的秘密法官。
    如果小镇的法官真的存在，那么：
    小镇的法官不相信任何人。
    每个人（除了小镇法官外）都信任小镇的法官。
    只有一个人同时满足属性 1 和属性 2 。*/
    public int findJudge(int N, int[][] trust) {
        int[]intrust=new int[N+1];
        int[]outtrust=new int[N+1];
        for(int [] arr:trust){
            intrust[arr[1]]++;
            outtrust[arr[0]]++;
        }
        for(int i=1;i<=N;i++){
            if(intrust[i]==N-1&&outtrust[i]==0){
                return i;
            }
        }
        return -1;
    }
    //给你一个整数数组 A，只有可以将其划分为三个和相等的非空部分时才返回 true，否则返回 false。
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        if(sum%3!=0){
            return false;
        }
        int count=0;
        int n=0;
        for(int i=0;i<arr.length-1;i++){
            count+=arr[i];
            if(count==(sum/3)){
                n++;
                if(n==2){
                    return true;
                }
                count=0;
            }
        }
        return false;
    }
    //给你一个 m 行 n 列的二维网格 grid 和一个整数 k。你需要将 grid 迁移 k 次。
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int[] nums = new int[grid.length * grid[0].length];
        int n=0;
        for(int i = 0;i < grid.length;i++) {
            for(int j = 0;j < grid[0].length;j++) {
                nums[n++] = grid[i][j];
            }
        }
        while(k!=0){
            int tmp=nums[nums.length-1];
            for(int i=nums.length-2;i>=0;i--){
                nums[i+1]=nums[i];
            }
            nums[0]=tmp;
            k--;
        }
        k = 0;
        List<List<Integer>> lists = new ArrayList<>(grid.length);
        for(int i = 0;i < grid.length;i++) {
            List<Integer> tempList = new ArrayList<>(grid[0].length);
            for(int j = 0;j <grid[0].length;j++) {
                tempList.add(nums[k++]);
            }
            lists.add(tempList);
        }
        return lists;
    }
}

