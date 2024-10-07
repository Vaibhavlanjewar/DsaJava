/* Geek wants to climb from the 0th stair to the (n-1)th stair. At a time the Geek can climb either one or two steps. A height[N] array is also given. Whenever the geek jumps from stair i to stair j, the energy consumed in the jump is abs(height[i]- height[j]), where abs() means the absolute difference. return the minimum energy that can be used by the Geek to jump from stair 0 to stair N-1.

Example:

 

Input: n = 4, height = {10 20 30 10}
Output: 20
Explanation:
Geek jump from 1st to 2nd stair(|20-10| = 10 energy lost). Then a jump from the 2nd to the last stair(|10-20| = 10 energy lost). So, total energy lost is 20 which is the minimum.
Your Task:
You don't need to read input or print anything. Your task is to complete the function MinimumEnergy() which takes the array height, and integer n, and returns the minimum energy that is lost.

Expected Time Complexity: O(n)
Expected Space Complexity: O(n)

Constraint:
1<=n<=100000
1<=height[i]<=1000

 */
import java.util.*;

public class pr2_FrogJump {
    public static int minimumEnergy(int heights[], int N) {
        // Base case: if there's only one stair, no energy is needed.
        if (N == 1) return 0;

        // DP array to store the minimum energy required to reach each stair
        int dp[] = new int[N];
        dp[0] = 0;  // No energy needed to stay at the first stair

        // Fill dp array using the given transitions
        for (int i = 1; i < N; i++) {
            // Calculate the cost to jump from (i-1) to i
            int oneStep = dp[i - 1] + Math.abs(heights[i] - heights[i - 1]);
            
            // Initialize twoStep with a large value (invalid if i == 1)
            int twoStep = Integer.MAX_VALUE;
            
            // If we're at i >= 2, calculate the cost to jump from (i-2) to i
            if (i > 1) {
                twoStep = dp[i - 2] + Math.abs(heights[i] - heights[i - 2]);
            }

            // The minimum energy to reach step i is the minimum of one-step and two-step jumps
            dp[i] = Math.min(oneStep, twoStep);
        }

        // The answer is the minimum energy required to reach the last stair
        return dp[N - 1];
    }

    public static void main(String[] args) {
        int height[] = {10, 20, 30, 10};
        System.out.println(minimumEnergy(height, height.length));  // Output: 20
    }
}
