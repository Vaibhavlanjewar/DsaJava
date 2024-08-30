/* 35. Search Insert Position
Solved
Easy
Topics
Companies
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104 */
import java.util.Scanner;



public class Ltc35_SearchInsertPosition{
    public static int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int s=0,e=n-1;
        int ans=n;
        while(s<=e){
         int mid=(s+e)/2;
         if(nums[mid]>=target){
           ans=mid;
            e=mid-1;
          
         }
         else{
           s=mid+1;
          }
        }
        return ans;
    }


    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
 //enter a size for an arr 
    int nums[]=new int[size];
    for(int i=0;i<size;i++){
    nums[i]=sc.nextInt();
   }
  //enter a key 
   int key=sc.nextInt();
   System.out.print(searchInsert(nums,key));
}

}
