public class pr3_FrogJumpWithKDistance {
    public static int minimizeCost(int k, int arr[]) {
        // code here
        int n=arr.length;
        if(n==0) return 0;
        int dp[]=new int[n];
        
        
        dp[0]=0;
        for(int i=1;i<n;i++){
              dp[i]=Integer.MAX_VALUE;
              
              for(int j=1;j<=k && i-j>=0;j++){
                  int cost=dp[i-j]+Math.abs(arr[i]-arr[i-j]);
                  dp[i]=Math.min(dp[i],cost);
              }
        }
        return dp[n-1];
      
    }
    public static void main(String args[]){
        int k=3;
        int arr[]={10, 30, 40, 50, 20};
        System.out.println(minimizeCost(k,arr));
    }
}