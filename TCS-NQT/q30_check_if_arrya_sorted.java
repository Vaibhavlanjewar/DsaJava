/*  
Check if array is sorted
Difficulty: EasyAccuracy: 39.37%Submissions: 210K+Points: 2
Given an array arr[], check whether it is sorted in non-decreasing order. Return true if it is sorted otherwise false.

Examples:

Input: arr[] = [10, 20, 30, 40, 50]
Output: true
Explanation: The given array is sorted.
Input: arr[] = [90, 80, 100, 70, 40, 30]
Output: false
Explanation: The given array is not sorted.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ arr.size ≤ 106
- 109 ≤ arr[i] ≤ 109

*/
import java.util.*;
public class q30_check_if_arrya_sorted {
   public static boolean arraySortedOrNot(int[] arr, int n) {
        // code here
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]) return false;
        }
        return true;
    }
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int arr[]=new int[n];
         for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
          }
          System.out.print(arraySortedOrNot(arr,n));
    }
}
