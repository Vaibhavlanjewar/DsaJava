/* Problem Statement: Given an array of integers where every element appears an even number of times except one element which appears an odd number of times, write a program to find that odd number of times occurring element.

Sample Test Case 1:
n = 7
arr = [1, 1, 2, 2, 2, 3, 3]
Output: 2
Sample Test Case 2:
n = 5
arr = [2, 2, 3, 1, 1]
Output: 3  */

//compile and run
//javac q47_FindOddTimeRepeatedElement.java
//java q47_FindOddTimeRepeatedElement

import java.util.*;
public class q47_FindOddTimeRepeatedElement{

 public static int findOddOccEle(int arr[],int n){
   HashMap<Integer,Integer>mp=new HashMap<>();
   for(int i=0;i<n;i++){
     mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
    }
    
   for(int i:arr){
    if(mp.get(i)%2==1){
      return i;
     }
   }
   return -1;
  }

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];

   for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
     }
   System.out.print(findOddOccEle(arr,n));
    

   }

}

