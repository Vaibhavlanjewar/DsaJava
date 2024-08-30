/*
Ceil The Floor (Upper and lower bound )
Difficulty: EasyAccuracy: 43.76%Submissions: 92K+Points: 2
Given an unsorted array arr[] of integers and an integer x, find the floor and ceiling of x in arr[].

Floor of x is the largest element which is smaller than or equal to x. Floor of x doesn’t exist if x is smaller than smallest element of arr[].
Ceil of x is the smallest element which is greater than or equal to x. Ceil of x doesn’t exist if x is greater than greatest element of arr[].

Return an array of integers denoting the [floor, ceil]. Return -1 for floor or ceiling if the floor or ceiling is not present.

Examples:

Input: x = 7 , arr[] = [5, 6, 8, 9, 6, 5, 5, 6]
Output: 6, 8
Explanation: Floor of 7 is 6 and ceil of 7 is 8.
Input: x = 10 , arr[] = [5, 6, 8, 8, 6, 5, 5, 6]
Output: 8, -1
Explanation: Floor of 10 is 8 but ceil of 10 is not possible.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints :
1 ≤ arr.size ≤ 105
1 ≤ arr[i], x ≤ 106

 

 */
import java.util.*;
  
public class UpperBoundAndLowerBound {
    // lower bound 
    public static int findFloor(int arr[], int n, int x) {
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
      
      public static int findCeil(int arr[],int n,int x){
       int s=0,e=n-1;
        int  ans=-1;
       while(s<=e){
        int mid=(s+e)/2;
         if(arr[mid]<x){
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
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
        }
     
        //enter key to find lower bound of 
        int key=sc.nextInt();
     
        System.out.println(findFloor(arr,size,key));
        System.out.println(findCeil(arr, size, key));
       
        }
     
}
