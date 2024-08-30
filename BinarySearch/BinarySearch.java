/*704. Binary Search
Easy
Topics
Companies
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

//  https://leetcode.com/problems/binary-search/description/

Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
Example 2:

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1
 

Constraints:

1 <= nums.length <= 104
-104 < nums[i], target < 104
All the integers in nums are unique.
nums is sorted in ascending order. */


import java.util.*;

public class BinarySearch{

public static int BinarySearch(int arr[],int key){
  int i=0,j=arr.length-1;
  while(i<=j){
  int mid=(i+j)/2;
  if(arr[mid]==key){
   return mid;
  }
  else if(arr[mid]<key){
      i=mid+1;
  }
  else{
   j=mid-1;
   }

  }
  return -1;
}
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int size=sc.nextInt();
//enter a size for an arr 
  int arr[]=new int[size];
  for(int i=0;i<size;i++){
  arr[i]=sc.nextInt();
 } 
//enter a key 
 int key=sc.nextInt();
 System.out.print(BinarySearch(arr,key));
}

}
