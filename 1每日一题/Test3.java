import java.util.*;
public class Test3 {
        public static void main1(String[] args) {
            Scanner in = new Scanner(System.in);
            while (in.hasNext()) {
                int n = in.nextInt();
                int[]num=new int[n];
                for(int i=0;i<n;i++){
                    num[i]=in.nextInt();
                }
                ArrayList<ArrayList<Integer>> ret=new ArrayList<>();
                int i=0;
                while(i<n-1){
                    ArrayList<Integer>list=new ArrayList<>();
                    list.add(num[i]);
                    if(num[i]==num[i+1]){
                        list.add(num[i+1]);
                        i++;
                    }
                    if(num[i]<num[i+1]){
                        while(i<n-1 && num[i]<=num[i+1]){
                            list.add(num[i+1]);
                            i++;
                        }
                        if(i>=n-1){
                           i=n;
                        }else{
                            i++;
                        }
                    }
                    else if(num[i]>num[i+1]){
                        while(i<n-1 && num[i]>=num[i+1]){
                            list.add(num[i+1]);
                            i++;
                        }
                        if(i>=n-1){
                           i=n;
                        }else{
                            i++;
                        }
                    }
                    ret.add(list);
                }
                System.out.println(ret.size());
            }
        }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[]num=new int[n];
        for(int i=0;i<n;i++){
            num[i]=in.nextInt();
        }
        int flag=0;
        int count=1;
        for(int i=0;i<n-1;i++){
            if(num[i+1]>num[i]){
                if(flag==0){
                    flag=1;//递增
                }
                if(flag==-1){
                    flag=0;
                    count++;//递减变递增，加一
                }
                //每变化一次后重置，再看是递增还是递减
            }else if(num[i+1]<num[i]){
                if(flag==0){
                    flag=-1;//递减
                }
                if(flag==1){
                    flag=0;
                    count++;//递增变递减，加一
                }
            }
        }
        System.out.println(count);
    }
    }

