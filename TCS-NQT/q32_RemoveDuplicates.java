
/*
Array Duplicates
Difficulty: EasyAccuracy: 18.95%Submissions: 745K+Points: 2
Given an array arr of size n which contains elements in range from 0 to n-1, you need to find all the elements occurring more than once in the given array. Return the answer in ascending order. If no such element is found, return list containing [-1]. 

Examples:

Input: n = 4, arr[] = [0,3,1,2]
Output: -1
Explanation: There is no repeating element in the array. Therefore output is -1.
Input: n = 5, arr[] = [2,3,1,2,3]
Output: 2 3 
Explanation: 2 and 3 occur more than once in the given array.
Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n).

Constraints:

1 <= n <= 105
0 <= arr[i] <= 105, for each valid i
 */

 import java.util.*;
 public class q32_RemoveDuplicates {
     
      public static ArrayList<Integer> removeDuplicate(int arr[]) {
        int n=arr.length;
       
        ArrayList<Integer>res=new ArrayList<>();
        
        for(int i=0;i<n;i++){
          if(!res.contains(arr[i])){
            res.add(arr[i]);
          }
          }  
       return res;
         
     }
    public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int arr[]=new int[n];
          for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
           }
          System.out.println(removeDuplicate(arr));
     }
 }
 
 