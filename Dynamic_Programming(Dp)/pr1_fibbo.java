import java.util.*;
public class pr1_fibbo {

    public static int f(int n,int []dp){
        if(n<=1){
            return n;
        }
        if(dp[n]!=-1)return dp[n];
        return dp[n]=f(n-1,dp)+f(n-2,dp);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        
        // System.out.println(f(n,dp));
        
        int prev2=0;
        int prev=1;
        for(int i=2;i<=n;i++){
            int curr1=prev+prev2;
            prev2=prev;
            prev=curr1;
        }
        System.out.print(prev);
    }
}

// 0(n) tc 
//and sc 0(n) rec stack and o(n) dp array
