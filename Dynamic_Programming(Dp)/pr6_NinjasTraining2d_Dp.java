public class pr6_NinjasTraining2d_Dp {
    public static int f(int day, int last, int[][] points, int[][] dp) {
        if (day == 0) {
            int maxi = 0;
            for (int task = 0; task < 3; task++) {
                if (task != last) {
                    maxi = Math.max(maxi, points[0][task]);
                }
            }
            return dp[day][last] = maxi;
        }
        if (dp[day][last] != -1)
            return dp[day][last];
        int maxi = 0;
        for (int task = 0; task < 3; task++) {
            if (task != last) {
                int point = points[day][task] + f(day - 1, task, points, dp);
                maxi = Math.max(maxi, point);
            }
        }
        return dp[day][last] = maxi;
    }

    public static int ninjaTraining(int n, int points[][]) {

        // Write your code here..
        int dp[][] = new int[n][4];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        return f(n - 1, 3, points, dp);
    }

    public static void main(String args[]) {

        // Define the points for each activity on each day
        int[][] points = { { 10, 40, 70 },
                { 20, 50, 80 },
                { 30, 60, 90 } };

        // memoization

        int n = points.length; // Get the number of days
        System.out.println(ninjaTraining(n, points)); // Calculate and print the maximum points

        // -------------------------------------------
        // Tabulation
        int dp[][] = new int[n][4];

        // Base case: day 0
        dp[0][0] = Math.max(points[0][1], points[0][2]); // If we didn't do task 0 on day 0
        dp[0][1] = Math.max(points[0][0], points[0][2]); // If we didn't do task 1 on day 0
        dp[0][2] = Math.max(points[0][0], points[0][1]); // If we didn't do task 2 on day 0
        dp[0][3] = Math.max(points[0][0], Math.max(points[0][1], points[0][2])); // If we can do any task on day 0

        // Fill the DP table for the rest of the days
        for (int day = 1; day < n; day++) {
            for (int last = 0; last < 4; last++) {
                dp[day][last] = 0;
                for (int task = 0; task < 3; task++) {
                    if (task != last) { // Can't pick the same task as the previous day
                        int point = points[day][task] + dp[day - 1][task];
                        dp[day][last] = Math.max(dp[day][last], point);
                    }
                }
            }
        }

        // The answer will be the maximum points we can get on the last day with no
        // restriction on last task
        return dp[n - 1][3];

    }
}