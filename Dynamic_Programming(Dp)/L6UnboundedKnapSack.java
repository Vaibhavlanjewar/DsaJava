public class L6UnboundedKnapSack {
    public static int unboundedKnapSack(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];

        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i < W + 1; i++) { 
            dp[0][i] = 0;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) { // valid
                // include and exclude
                if (wt[i - 1] <= j) {
                    dp[i][j] = Math.max(val[i - 1] + dp[i][j - wt[i - 1]], dp[i - 1][j]);
                } else {
                    // invalid exclude
                    dp[i][j] = dp[i - 1][j];
                }
            }

        }
        return dp[n][W];
    }

    // time complexity 0(n*w)
    public static void main(String args[]) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };

        int W = 7;
        System.out.println(unboundedKnapSack(val, wt, W));

    }
}
