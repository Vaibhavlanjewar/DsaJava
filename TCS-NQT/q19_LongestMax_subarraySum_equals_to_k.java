/*Problem Statement:
Given an array of integers nums and an integer k, your task is to find the length of the longest subarray whose sum equals k.

Example:
Input: nums = [1, -1, 5, -2, 3], k = 3
Output: 4
Explanation: The subarray [1, -1, 5, -2] has the sum 3 and is the longest subarray with this sum.
Example 2:
Input: nums = [-2, -1, 2, 1], k = 1
Output: 2
Explanation: The subarray [-1, 2] has the sum 1 and is the longest subarray with this sum.
Notes:
The subarray should be contiguous.
You need to return the length of the subarray, not the subarray itself.
The array may contain both positive and negative numbers.

*/ 


import java.util.*;
public class q19_LongestMax_subarraySum_equals_to_k {

    public static int MaxSubArraySumK(int []nums,int k){
       int sum=0;
       int maxLength=0;
       HashMap<Integer,Integer>preSum=new HashMap<>();

       for(int i=0;i<nums.length;i++){
        sum+=nums[i];
       
        if(sum==k){
          maxLength=i+1;
         
        }
        int rem=sum-k;
        if(preSum.containsKey(rem)){
         maxLength=Math.max(maxLength,i-preSum.get(rem));
        }
        if(!preSum.containsKey(sum)){
           preSum.put(sum,i);
        }
    }
        return maxLength;
}  
    
 
 
   
    public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
    System.out.println("enter size ");
    int n=sc.nextInt();
    System.out.println("enter value of k ");
    int k=sc.nextInt();
    int nums[]=new int[n];
    System.out.println("enter array el");
    for(int i=0;i<n;i++){
    nums[i]=sc.nextInt();
    }   
    System.out.println(MaxSubArraySumK(nums,k));  

    }

    }