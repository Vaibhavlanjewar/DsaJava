import java.util.Arrays;

public class pr4_HouseRobber198 {
    // https://leetcode.com/problems/house-robber/description/
   
   public static int f(int ind,int nums[],int dp[]){
    if(ind==0) return nums[ind];
    if(ind<0) return 0;

    if(dp[ind]!=-1)return dp[ind];

    int pick=nums[ind]+f(ind-2,nums,dp);
    int notPick=0+f(ind-1,nums,dp);

    return dp[ind]=Math.max(pick,notPick);
   }
   
   public static int spaceOpt(int nums[] ){
    int n=nums.length;
    int prev=nums[0];
    int prev2=0;
    for(int i=1;i<n;i++){
        int take=nums[i];
        if(i>1){
            take+=prev2;
        }
        int notTake=0+prev;
        int curri=Math.max(take,notTake);
        prev2=prev;
        prev=curri;
    }
    return prev;
   }
    public static void main(String args[]){
        int nums[]={1,2,3,1};
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        System.out.println(f(n-1,nums,dp));
        System.out.println(spaceOpt(nums));
    }
}
