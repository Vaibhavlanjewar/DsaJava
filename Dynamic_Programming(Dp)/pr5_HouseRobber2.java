import java.util.Arrays;

public class pr5_HouseRobber2 {
     public static int hr(int nums[]){
        int n=nums.length;
        int prev=nums[0];
        int prev2=0;

        for(int i=1;i<n;i++){
            int take=nums[i];
            if(i>1)take+=prev2;
            int notTake=prev;
            int curri=Math.max(take,notTake);
            prev2=prev;
            prev=curri;
        }
        return prev;
    }
   
    public static void main(String args[]){
        int nums[]={2,3,2};
        int n=nums.length;
        if(n==1)System.out.println(nums[0]);

        int temp1[]=Arrays.copyOfRange(nums,1,n);
        int temp2[]=Arrays.copyOfRange(nums,0,n-1);

         System.out.println(Math.max(hr(temp1),hr(temp2)));
        
    }
}
