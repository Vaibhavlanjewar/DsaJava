
/*
 Remove Duplicates from unsorted array
Difficulty: BasicAccuracy: 42.1%Submissions: 24K+Points: 1
Given an array arr of integers which may or may not contain duplicate elements. Your task is to remove duplicate elements.

Examples:

Input: arr[] = [1, 2, 3, 1, 4, 2]
Output: [1, 2, 3, 4]
Explanation: 2 and 1 have more than 1 occurence.
Input: arr[] = [1, 2, 3, 4]
Output: [1, 2, 3, 4]
Explanation: There is no duplicate element.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

Constraints:
1<=arr.size()<=106
1<=arr[i]<=105
 */
import java.util.*;
public class q31_removeDuplicateFromArray{

   public static ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        int j=1,n=arr.length;
        TreeSet<Integer>ts=new TreeSet<>();
        ArrayList<Integer>res=new ArrayList<>();
        
        for(int i=1;i<n;i++){
          
           ts.add(arr[i]);
       
          }
        
        for(Integer Interator:ts){
          res.add(Interator);
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
          // Arrays.sort(arr);
          ArrayList<Integer>res=removeDuplicate(arr);
          System.out.println(res);
    }
}

