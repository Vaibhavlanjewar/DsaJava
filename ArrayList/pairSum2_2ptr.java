import java.util.ArrayList;

public class pairSum2_2ptr {
    public static boolean pairSumRotated_sorted(ArrayList<Integer>list,int target){
        // find the break point 
        int n=list.size();
        int bp=-1;
        for(int i=0;i<n;i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        int rp=bp;
        int lp=bp+1;
        while(lp!=rp){
            int sum=list.get(rp)+list.get(lp);
            // case 1
            if(sum==target) return true ;
            // case 2
            else if(sum<target) lp=(lp+1)%n;
            else rp=(n+rp-1)%n;
        }
        return false;
    }
    public static void main(String[] args) {
// array is rotated and sorted , 
       ArrayList<Integer>list=new ArrayList<>();
       // 11,15,6,8,9,10
       list.add(11);
       list.add(15);
       list.add(6);
       list.add(8);
       list.add(9);
       list.add(10);

       int target=16;
       System.out.println(pairSumRotated_sorted(list, target));


    }
}
