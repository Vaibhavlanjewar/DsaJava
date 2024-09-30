
/*Problem Statement:
Problem Statement: kadanes
Given an integer array nums, find the subarray with the largest sum and return its sum.

Example:
Input: nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output: 6
Explanation: The subarray [4, -1, 2, 1] has the largest sum, which is 6.

 */
import java.util.*;

public class q17_Maxsum_of_SubArray_14_5_24 {
   public static void main(String args[]) {

      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int[] nums = new int[size];

      for (int i = 0; i < size; i++) {
         nums[i] = sc.nextInt();
      }
      int MaxSum = 0;
      int currSum = 0;
      for (int i : nums) {
         currSum += i;
         if (currSum < 0) {
            currSum = 0;
         }
         MaxSum = Math.max(MaxSum, currSum);
      }
      System.out.println(MaxSum);

   }

}
