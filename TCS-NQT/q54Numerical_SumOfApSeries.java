
/*Sum of AP series
Difficulty: BasicAccuracy: 31.98%Submissions: 21K+Points: 1
A series with same common difference is known as arithmetic series. The first term of series is 'a' and common difference is d. The series looks like a, a + d, a + 2d, a + 3d, . . . Find the sum of series upto nth term.

 

Example 1:

Input: n = 5, a = 1, d = 3
Output: 35
Explanation: Series upto 5th term is
1 4 7 10 13, so sum will be 35.
Example 2:

Input: n = 3, a = 1, d = 2
Output: 9
Example: Series upto 3rd term is 
1 3 5, so sum will be 9.
 

Your Task:
You don't need to read or print anything. Your task is to complete the function sum_of_ap() which takes n, a and d as input parameter and returns the sum of the series.
 

Expected Time Complexity: O(1)
Expected Space Complexity: O(1)
 

Constranits:
1 <= n, a, d <= 10000

https://www.geeksforgeeks.org/problems/sum-of-ap-series4512/1

 */
import java.util.*;

public class q54Numerical_SumOfApSeries {

    public static long sum_of_ap(long n, long a, long d) {
        long sum = 0;
        return n * (2 * a + (n - 1) * d) / 2;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); // n
        long a = sc.nextLong(); // first term
        long d = sc.nextLong(); // common diff

        System.out.print(sum_of_ap(n, a, d));

    }
}
