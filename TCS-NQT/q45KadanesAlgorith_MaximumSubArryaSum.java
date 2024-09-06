/* Kadane's Algorithm
Difficulty: MediumAccuracy: 36.28%Submissions: 969K+Points: 4
Given an integer array arr[]. Find the contiguous sub-array(containing at least one number) that has the maximum sum and return its sum.
//https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1

Examples:

Input: arr[] = [1, 2, 3, -2, 5]
Output: 9
Explanation: Max subarray sum is 9 of elements (1, 2, 3, -2, 5) which is a contiguous subarray.
Input: arr[] = [-1, -2, -3, -4]
Output: -1
Explanation: Max subarray sum is -1 of element (-1)
Input: arr[] = [5, 4, 7]
Output: 16
Explanation: Max subarray sum is 16 of element (5, 4, 7)
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ arr.size() ≤ 105
-107 ≤ arr[i] ≤ 107

*/

import java.util.*;
public class q45KadanesAlgorith_MaximumSubArryaSum {
    public static int maxSubarraySum(int[] arr) {

        // Your code here
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i:arr){
            if(sum<0){
             sum=0;
            }
            sum+=i;
            maxSum=Math.max(sum,maxSum);
        }
        return maxSum==Integer.MIN_VALUE?-1 :maxSum;
    }

    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int size=sc.nextInt();
     int arr[]=new int[size];
     for(int i=0;i<size;i++){
          arr[i]=sc.nextInt();
       }
      System.out.print(maxSubarraySum(arr));
    }

    
}
