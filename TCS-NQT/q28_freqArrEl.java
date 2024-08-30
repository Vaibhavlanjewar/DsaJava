/* 
Frequencies of Limited Range Array Elements
Difficulty: EasyAccuracy: 27.64%Submissions: 291K+Points: 2
You are given an array arr[] containing positive integers. These integers can be from 1 to p, and some numbers may be repeated or absent. Your task is to count the frequency of all numbers that lie in the range 1 to n.

Note:

Do modify the array in-place changes in arr[], such that arr[i] = frequency(i) and assume 1-based indexing.
The elements greater than n in the array can be ignored when counting.
Examples

Input: n = 5, arr[] = [2, 3, 2, 3, 5], p = 5
Output: [0, 2, 2, 0, 1]
Explanation: Counting frequencies of each array element We have: 1 occurring 0 times. 2 occurring 2 times. 3 occurring 2 times. 4 occurring 0 times. 5 occurring 1 time, all the modifications done in the same given arr[].
Input: n = 4, arr[] = [3, 3, 3, 3], p = 3
Output: [0, 0, 4, 0]
Explanation: Counting frequencies of each array element We have: 1 occurring 0 times. 2 occurring 0 times. 3 occurring 4 times. 4 occurring 0 times.
Input: n = 2, arr[] = [8, 9], p = 9
Output: [0, 0]
Explanation: Counting frequencies of each array element We have: 1 occurring 0 times. 2 occurring 0 times. Since here P=9, but there are no 9th Index present so can't count the value.
Expected time complexity: O(n)
Expected auxiliary space: O(1)
//https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/1

*/
import java.util.*;
public class q28_freqArrEl {

 public static void frequencyCount(int arr[], int N, int P) {
        // do modify in the given array
        int ans[]=new int[N];
        Arrays.fill(ans, 0);
      for(int i=0;i<N;i++){
        if(arr[i]>=1 && arr[i]<=P && arr[i]<=N){
        ans[arr[i]-1]++;       
      }
      else{
          continue;
      }
      
      }
      for(int i=0;i<N;i++){
      arr[i]=ans[i];
      }
    }

 public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int p=sc.nextInt();
   int arr[]=new int[n];

   for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
   }

  frequencyCount(arr,n,p);
  System.out.println(Arrays.toString(arr));
 }
    
}
