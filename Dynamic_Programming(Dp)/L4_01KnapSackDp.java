public class L4_01KnapSackDp {

    public static int knapsack01Rec(int[]val,int []wt,int W,int n){
    
        if(W==0 ||n==0){
            return 0;
        }
        if(wt[n-1]<=W){ // valid 
        //  include
        int ans1=val[n-1]+knapsack01Rec(val, wt, W-wt[n-1], n-1);

        // exclude
        int ans2=knapsack01Rec(val,wt,W,n-1);
        return Math.max(ans1,ans2);
        }
        else{
            return knapsack01Rec(val,wt,W,n-1);
        }
        
    }
    // 0 1 knapSack by Memoization 
    public static int knapSack01Memo(int []val,int[]wt,int W,int n,int dp[][]){
       if(W==0 ||n==0)return 0;
       if(dp[n][W]!=-1){
        return dp[n][W];
       }
       if(wt[n-1]<=W){ //valid
        //Include 
        int ans1=val[n-1]+knapSack01Memo(val, wt, W-wt[n-1], n-1, dp);
        
        // exclude
        int ans2=knapSack01Memo(val, wt, W, n-1, dp);

        dp[n][W]=Math.max(ans1,ans2);
        return dp[n][W];

       }
       else{
          return knapSack01Memo(val,wt,W,n-1,dp);
       }
       
    }

    public static int knapSackTab(int val[],int [] wt,int W){
        int n=val.length;
        int dp[][]=new int[n+1][W+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<dp[0].length;i++){
            dp[0][i]=0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                int v=val[i-1];
                int w=wt[i-1];
                if(w<=j){
                    //valid
                   int incProfit=v+dp[i-1][j-w]; 
                   int excProfit=dp[i-1][j];
                   dp[i][j]=Math.max(incProfit,excProfit);
                }
                else{
                    //invalid 
                    int excProfit=dp[i-1][j];
                    dp[i][j]=excProfit;
                }
            }
        }
        System.out.println("Print- dp tabulation ");
        print(dp);
        return dp[n][W]; //final max profit
    }

    public static void print(int[][]dp){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
public static void main(String arg[]){
    int val[]={15,14,10,45,30}; // value of item 
    int wt[]={2,5,1,3,4};//weight of items 
    int W=7; //capacity of sack
    int n=val.length;

    // recursion 
    System.out.println("Knapsack using rec:"+knapsack01Rec(val, wt, W, n));

    int dp[][]=new int[n+1][W+1];
     for(int i=0;i<dp.length;i++){
        for(int j=0;j<dp[0].length;j++){
            dp[i][j]=-1;
        }
    }
    // memoization-dp soln , 0(n*W) time complexity
    System.out.println("KnapSack using memo:"+knapSack01Memo(val, wt, W, n, dp));
    System.out.println("Dp - memoization ");
    print(dp);
    // tabulation -dp  0(n*W) time complexity
    System.out.println("Knapsack using tabulation "+knapSackTab(val, wt, W));
   
}    
}

 /* Output
Knapsack using rec:75
KnapSack using memo:75
Dp - memoization
-1 -1 -1 -1 -1 -1 -1 -1
-1 -1 15 15 15 -1 15 15
-1 -1 -1 -1 -1 -1 15 29
-1 -1 -1 25 25 -1 -1 29
-1 -1 -1 45 -1 -1 -1 70
-1 -1 -1 -1 -1 -1 -1 75

Print- dp tabulation
0 0 0 0 0 0 0 0
0 0 15 15 15 15 15 15
0 0 15 15 15 15 15 29
0 10 15 25 25 25 25 29
0 10 15 45 55 60 70 70
0 10 15 45 55 60 70 75

Knapsack using tabulation 75 */
