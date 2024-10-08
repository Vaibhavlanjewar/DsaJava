

/*K Sized Subarray Maximum
Difficulty: MediumAccuracy: 26.04%Submissions: 319K+Points: 4
Given an array arr[] of size N and an integer K. Find the maximum for each and every contiguous subarray of size K.

Example 1:

Input:
N = 9, K = 3
arr[] = 1 2 3 1 4 5 2 3 6
Output: 
3 3 4 5 5 5 6 
Explanation: 
1st contiguous subarray = {1 2 3} Max = 3
2nd contiguous subarray = {2 3 1} Max = 3
3rd contiguous subarray = {3 1 4} Max = 4
4th contiguous subarray = {1 4 5} Max = 5
5th contiguous subarray = {4 5 2} Max = 5
6th contiguous subarray = {5 2 3} Max = 5
7th contiguous subarray = {2 3 6} Max = 6
Example 2:

Input:
N = 10, K = 4
arr[] = 8 5 10 7 9 4 15 12 90 13
Output: 
10 10 10 15 15 90 90
Explanation: 
1st contiguous subarray = {8 5 10 7}, Max = 10
2nd contiguous subarray = {5 10 7 9}, Max = 10
3rd contiguous subarray = {10 7 9 4}, Max = 10
4th contiguous subarray = {7 9 4 15}, Max = 15
5th contiguous subarray = {9 4 15 12}, 
Max = 15
6th contiguous subarray = {4 15 12 90},
Max = 90
7th contiguous subarray = {15 12 90 13}, 
Max = 90

https://www.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1?page=1&sprint=a663236c31453b969852f9ea22507634&sprint=a663236c31453b969852f9ea22507634&sortBy=submissions
*/

import java.util.ArrayList;
import java.util.PriorityQueue;

public class q21_kSizedSubArrayMximum {
      static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {  // only 900/1100 test cases solves o

        // Your code here
        ArrayList<Integer>res=new ArrayList<>();
            
            for(int i=0;i<=n-k;i++){
            PriorityQueue<Integer>pq= new PriorityQueue<>((a, b) -> b - a);
                for(int j=i;j<i+k;j++){
                    pq.add(arr[j]);
                  }
                 res.add( pq.peek());
                 
        }
        return res;
    }

    public static void main(String[] args) {
       int arr[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
       int k=3;
       int n = arr.length;
       ArrayList<Integer> result = max_of_subarrays(arr, n, k);
       System.out.println(result.toString());
    }
}
