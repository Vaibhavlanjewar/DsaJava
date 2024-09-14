public class L9WildCardMatching {
    public static boolean isMAtch(String s, String p) {
        int n = s.length();
        int m = p.length();

        boolean dp[][] = new boolean[n + 1][m + 1];
        // initialization 
        dp[0][0] = true;

        // If pattern is empty, string cannot be matched unless both are empty
        for (int i = 1; i <= n; i++) {
            dp[i][0] = false;
        }

        // If string is empty, pattern can only match if it is all '*' characters
        for (int j = 1; j <= m; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }

        // bottom-up DP
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                // Case 1: Characters match or '?' matches any single character
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                // Case 2: '*' can match zero or more characters
                else if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j]; // Zero characters or one/more characters
                }
                // Case 3: Mismatch
                else {
                    dp[i][j] = false;
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        String s = "baaabab";
        String p = "*****ba****ab";
        System.out.println(isMAtch(s, p)); // true
    }
}
 