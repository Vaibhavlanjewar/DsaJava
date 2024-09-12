public class L7_RodCuttingUnbounded {
    public static int rodcutting(int []length,int price[],int totRod){
        int n=price.length;
        int dp[][]=new int[n+1][totRod+1];
        // already initialise with 0
        for(int i=1;i<n+1;i++){
            for(int j=1;j<totRod+1;j++){
                if(length[i-1]<=j){
                    // valid 
                    dp[i][j]=Math.max(price[i-1]+dp[i-1][j-length[i-1]],dp[i-1][j]);

                }
                else{
                   dp[i][j]=dp[i-1][j]; 
                }
            }
        }
        return dp[n][totRod];
    }
    public static void main(String args[]){
     int length[]={1,2,3,4,5,6,7,8};
     int price[]={1,5,8,9,10,17,17,20};
     int rodLength=8;
     System.out.println(rodcutting(length,price,rodLength));
    }
}
