/*Equal Sum
Difficulty: MediumAccuracy: 37.32%Submissions: 29K+Points: 4
Given an array arr. Determine if there exists an element in the array such that the sum of the elements on its left is equal to the sum of the elements on its right. If there are no elements to the left/right, then the sum is considered to be zero. 

Example:

Input: arr[] = [1, 2, 3, 3]
Output: true
Explanation: Consider 1-based indexing i = 3, for [1, 2] sum is 3 and for [3] sum is also 3.
Input: arr[] = [1, 5]
Output: false
Explanation: No such index present.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ arr.size() ≤ 105 
1 ≤ arr[i] ≤ 106 */



import java.util.*;
public class q25_equlibriumPoint_gfg_tcs {

public static String equilibrium(int arr[]) {
        // code here
        int leftSum=0;
        int totSum=0;
        int n=arr.length;

       for(int i:arr){
     totSum+=i;
    }

    for(int i=0;i<n;i++){
     totSum-=arr[i];
     if(totSum==leftSum){
      return "true";
     }
     leftSum+=arr[i];
    
    }
       return "false";
    }
     public static void main(String args[]){

    Scanner sc=new Scanner(System.in);

    int size=sc.nextInt();
    

    int arr[]=new int[size];

    for(int i=0;i<size;i++){
      arr[i]=sc.nextInt();
    }
    
    System.out.println(equilibrium(arr));
     
    }
}