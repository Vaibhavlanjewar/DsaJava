public class FibonacciArr{

    // fibonacci using recursion  time complexity 0(2^n)
    public static int fibbonaciRec(int n){
        if(n==0 ||n==1){
            return n;
        }
        return fibbonaciRec(n-1)+fibbonaciRec(n-2);
    }

    // using DP Memoization 0(n) time complexity 
    public static int fibMemoi(int n,int []f){
        if(n==0 ||n==1){
            return n;
        }
        if(f[n]!=0){
            return f[n];
        }
        return fibMemoi(n-1,f)+fibMemoi(n-2,f);

    }

    // fibbonacci code using tablulation ,time complexity 0(n)
    public static int FibTab(int n){
        int dp[]=new int[n+1];  
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[]args){
        int n=6;

        // normal recursive code of fib 
        // System.out.println("Fibbonaci using recursion "+fibbonaciRec(n));


        int []f=new int[n+1];

        // memoization , fibonacci code 
        // System.out.println(fibMemoi(n,f));
  
        // tabluation 
        System.out.println(FibTab(n));

    }
}


  