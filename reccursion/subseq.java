// https://leetcode.com/problems/subsets/submissions/1390225126/
/*78. Subsets
Solved
Medium
Topics
Companies
Given an integer array nums of unique elements, return all possible 
subsets
 (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]
 

Constraints:

1 <= nums.length <= 10
-10 <= nums[i] <= 10
All the numbers of nums are unique. */
import java.util.*;
public class subseq {
    public static void printSubSequence(int ind,ArrayList<Integer>res,int arr[],int n){
        if(ind==n){
           for(int i:res){
            System.out.println(i);
           }
           if(res.size()==0){
            System.out.println("{}");
           }
           System.out.println();
        return;
        }
        res.add(arr[ind]);
        printSubSequence(ind+1, res, arr,n);
        res.remove(res.size()-1);
        printSubSequence(ind+1, res, arr,n);
    }
    public static void main(String args[]){
        int arr[]={3,1,2};
        int n=arr.length;
        ArrayList<Integer>res=new ArrayList<>();

        printSubSequence(0,res,arr,n);
    }
}
