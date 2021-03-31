public class Test3 {
    //给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，
    // 判断第一个字符串 ransom 能不能由第二个字符串 magazines 里面的字符构成。
    // 如果可以构成，返回 true ；否则返回 false。
    public boolean canConstruct(String ransomNote, String magazine) {
        char[]ran=ransomNote.toCharArray();
        char[]mag=magazine.toCharArray();
        for(int i=0;i<ran.length;i++){
            boolean flag=false;
            for(int j=0;j<mag.length;j++){
                if(ran[i]==mag[j]){
                    flag=true;//在杂志里找到后，所有元素向前移动，删除已经用过的
                    for(int k=j;k<mag.length-1;k++){
                        mag[k]=mag[k+1];
                    }
                    break;
                }
            }
            if(flag==false){
                return false;
            }
        }
        return true;
    }
}
