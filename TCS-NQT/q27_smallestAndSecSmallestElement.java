/* 
Find the smallest and second smallest element
Difficulty: BasicAccuracy: 24.44%Submissions: 105K+Points: 1
Given an array, arr of integers, your task is to return the smallest and second smallest element in the array. If the smallest and second smallest do not exist, return -1.

Examples:

Input: arr[] = [2, 4, 3, 5, 6]
Output: 2 3 
Explanation: 2 and 3 are respectively the smallest and second smallest elements in the array.
Input: arr[] = [1, 1, 1]
Output: -1
Explanation: Only element is 1 which is smallest, so there is no second smallest element.
Expected Time Complexity: O(n)
Expected Auxillary Space: O(1)

Constraints:
1 <= arr.size <= 105
1 <= arr[i] <= 105

*/


import java.util.*;
public class q27_smallestAndSecSmallestElement{
   public static int[] minAnd2ndMin(int arr[]) {
        int res[]=new int[2];
        int small=Integer.MAX_VALUE;
        int secSmall=Integer.MIN_VALUE;

        for(int i:arr){
         if(i<small){
          secSmall=small;
          small=i;
         }
         if(i<secSmall && i>small)
          secSmall=i;
        }
        if(small==Integer.MAX_VALUE || secSmall==Integer.MAX_VALUE){
            res[0]=-1;
            res[1]=-1;
        }
        else{
         res[0]=small;
         res[1]=secSmall;
        
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
      int res[]=new int[2];
      res=minAnd2ndMin(arr);
      System.out.println("Smallest element is: "+res[0]);
      System.out.println("Second smallest element is: "+res[1]);
   }   
}