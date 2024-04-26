import java.util.ArrayList;

public class pairSum1 {
    // vnbl 
    public static boolean pair_Sum1( ArrayList<Integer>arr, int target){
        boolean ans=false; // vnbl logic 
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                if(arr.get(i)+arr.get(j)==target){ // 0(n2)
                  ans=true;
                  System.out.println(arr.get(i)+ " "+ arr.get(i)+arr.get(j)+"=" +target);
                  break;
                }
            }
        }
        return ans;
    }
    // binary search 
    public static boolean pair_Sum1bs(ArrayList<Integer>arr, int target){
        boolean ans=false;
        int lp=0, rp=arr.size()-1;
        while(lp<rp){
            int res=arr.get(lp)+arr.get(rp);
            if(res==target){
                ans=true;
                break;   // 0(n)
            }
            else if(res<target) lp++;
            else rp--;
        }
        return ans;
    }
    public static void main(String args[]){
        ArrayList<Integer>arr=new ArrayList<>();
        int target=50;
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
// System.out.println("pairsum= "+ pair_Sum1(arr, target));
System.out.println("pairsum= "+ pair_Sum1bs(arr, target));

        
    }
}
