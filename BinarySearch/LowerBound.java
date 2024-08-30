/*  

Floor in a Sorted Array or lower bound
Difficulty: EasyAccuracy: 33.75%Submissions: 319K+Points: 2
Given a sorted array arr[] of size n without duplicates, and given a value x. Floor of x is defined as the largest element k in arr[] such that k is smaller than or equal to x. Find the index of k(0-based indexing).

Examples

Input: n = 7, x = 0 arr[] = {1,2,8,10,11,12,19}
Output: -1
Explanation: No element less than 0 is found. So output is "-1".
Input: n = 7, x = 5 arr[] = {1,2,8,10,11,12,19}
Output: 1
Explanation: Largest Number less than 5 is 2 (i.e k = 2), whose index is 1(0-based indexing).
Your Task:
The task is to complete the function findFloor() which returns an integer denoting the index value of K or return -1 if there isn't any such number.

Expected Time Complexity: O(log N).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ n ≤ 107
1 ≤ arr[i] ≤ 1018
0 ≤ x ≤ arr[n-1]

*/

import java.util.*;
public class LowerBound {
    public static int findFloor(long arr[], int n, long x) {
     int s=0,e=n-1;
     int ans=-1;
     while(s<=e){
     int mid=(s+e)/2;
   //if key is greater than the arr[mid]
     if(arr[mid]<=x){
      ans=arr[mid];
      s=mid+1;
     }
     else{
      e=mid-1;
     }

     }
    return ans;
   }

   public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
// enter the size of arr
   int size=sc.nextInt();
   long arr[]=new long[size];
   for(int i=0;i<size;i++){
   arr[i]=sc.nextLong();
   }

   //enter key to find lower bound of 
   long key=sc.nextLong();

   System.out.print(findFloor(arr,size,key));

  
   }
}
