/*  Sort 0s, 1s and 2s
Difficulty: EasyAccuracy: 50.58%Submissions: 682K+Points: 2
Given an array arr containing only 0s, 1s, and 2s. Sort the array in ascending order.

Examples:

Input: arr[]= [0, 2, 1, 2, 0]
Output: 0 0 1 2 2
Explanation: 0s 1s and 2s are segregated into ascending order.
Input: arr[] = [0, 1, 0]
Output: 0 0 1
Explanation: 0s 1s and 2s are segregated into ascending order.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 <= arr.size() <= 106
0 <= arr[i] <= 2

Seen this question in a real interview before ?
Yes
No
Company Tags
PaytmFlipkartMorgan StanleyAmazonMicrosoftOYO RoomsSamsungSnapdealHikeMakeMyTripOla CabsWalmartMAQ SoftwareAdobeYatra.comSAP LabsQualcomm
Topic Tags
Related Interview Experiences
Related Articles
Discover your potential with Deutsche Bank. Innovate, grow, and succeed globally in your career 

banner
Java (1.8)
Average Time: 10m

*/

import java.util.*;
public class sort012sgfg{
    public static void swap(int i,int j,ArrayList<Integer>arr){
      int temp=arr.get(i);
      arr.set(i,arr.get(j));
      arr.set(j,temp);
    }

    public static void sort012(ArrayList<Integer> arr) {
        // code here
          int s=0,i=0,e=arr.size()-1;
          while(i<=e){
          if(arr.get(i)==2){
            swap(i,e,arr);
            e--;
            } 

           else if(arr.get(i)==0){
             swap(i,s,arr);
             i++;
             s++;
            }
            else{ // if arr.get(i)==1 , skip 
             i++;
             }
          }
        
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<n;i++){
           int a=sc.nextInt();
           arr.add(a);
         }
       System.out.println("Before sorting "+arr);

       sort012(arr);
       System.out.println("After sorting "+arr);
    }
}