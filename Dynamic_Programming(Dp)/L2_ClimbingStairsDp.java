import java.util.Arrays;

public class L2_ClimbingStairsDp {
    public static int countWaysRec(int n){

        if(n==0) return 1;
        if(n<0) return 0; // to avoid 1-2 =-1 negative...
        return countWaysRec(n-1)+countWaysRec(n-2);
    }

    // by memoization
    public static int countWaysMemo(int n,int ways[]){
        if(n==0) return 1;
        if(n<0) return 0;

        if(ways[n]!=-1){
            return ways[n];
        }
        return countWaysMemo(n-1, ways)+countWaysMemo(n-2,ways);
    }

    // by Tabulation 
    public static int countWaysTab(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            if(i==1){
                dp[i]=dp[i-1];
            }
            else{
                dp[i]=dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String args[]){
        int n=5;
        // recursive approach --> time complexity 0(2^n)
        System.out.println("By rec :"+countWaysRec(n));
 
        // Memoization approach --> time complexity 0(n)
        int ways[]=new int[n+1];
        // fill by -1
        Arrays.fill(ways,-1);

        System.out.println("By memo :"+countWaysMemo(n, ways));

        // by Tabulation  --> time complexity 0(n)
        System.out.println(countWaysTab(n));
        
     }
}
  