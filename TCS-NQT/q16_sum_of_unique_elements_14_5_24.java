/*Problem Statement:
You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array. Your task is to return the sum of all the unique elements in nums.

Example 1:
Input: nums = [1, 2, 3, 2]
Output: 4
Explanation: The unique elements are [1, 3], and their sum is 4.
Example 2:
Input: nums = [1, 1, 1, 1, 1]
Output: 0
Explanation: There are no unique elements, so the sum is 0.
You need to write a function that takes in the array nums and returns the sum of the unique elements.

 */
import java.util.*;
public class q16_sum_of_unique_elements_14_5_24 {
    public static void main(String args[]){
 
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int []nums=new int[size];
    
    HashMap<Integer,Integer>mp=new HashMap<>();

    for(int i=0;i<size;i++){
     nums[i]=sc.nextInt();
     mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
    }
   int sum=0;
    for(int i:nums){
       if(mp.get(i)==1){
         sum+=i;
        }
     }
    System.out.println(sum);
     
   }

}
