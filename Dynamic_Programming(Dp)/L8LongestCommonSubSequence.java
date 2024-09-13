public class L8LongestCommonSubSequence {

    public static int lcs(String str1,String str2,int n,int m){
        if(n==0 ||m==0){
            return 0;
        }
        if(str1.charAt(n-1) ==str2.charAt(m-1)){
            // same
         return lcs(str1,str2,n-1,m-1)+1;
        }
        else{
            // diff
            int ans1=lcs(str1,str2,n-1,m);
            int ans2=lcs(str1,str2,n,m-1);
            return Math.max(ans1,ans2);
        }
    }

    public static int lcsTab(String str1,String str2){
        int n=str1.length();
        int m=str2.length();

        int dp[][]=new int[n+1][m+1];
        // initiaised with 0

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    int ans1=dp[i][j-1];
                    int ans2=dp[i-1][j];
                    dp[i][j]=Math.max(ans1,ans2);
                }
            }
        }
       return dp[n][m];
    }
public static void main(String args[]){
String str1="abcdge";
String str2="abedg";
System.out.println(lcs(str1,str2,str1.length(),str2.length()));

}    
}