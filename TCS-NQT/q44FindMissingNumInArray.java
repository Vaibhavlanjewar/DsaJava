/* Missing in Array

Given an array arr of size n−1 that contains distinct integers in the range of 1 to n (inclusive), find the missing element. The array is a permutation of size n with one element missing. Return the missing element.

Examples:

Input: n = 5, arr[] = [1,2,3,5]
Output: 4
Explanation : All the numbers from 1 to 5 are present except 4.
Input: n = 2, arr[] = [1]
Output: 2
Explanation : All the numbers from 1 to 2 are present except 2.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ n ≤ 105
1 ≤ arr[i] ≤ n

https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1
*/
import java.util.*;
public class q44FindMissingNumInArray {

    public static int missingNumber(int n, int arr[]) {

        // Your Code Here
       int sum=0;
       for(int i:arr){
        sum+=i;
       }
       int tot=(n*(n+1))/2;
       return tot-sum;

    }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
       int arr[]=new int[size];
      for(int i=0;i<size-1;i++){
       arr[i]=sc.nextInt();
       }
        System.out.print(missingNumber(size,arr));
     }
}


