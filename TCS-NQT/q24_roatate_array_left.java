/* Rotate Array

Given an unsorted array arr[] of size n. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. 

Note: Consider the array as circular.

Examples:  

input: n = 5, d = 2 arr[] = {1,2,3,4,5}
Output: 3 4 5 1 2
Explanation: 1 2 3 4 5  when rotated by 2 elements, it becomes 3 4 5 1 2.

Input:  d = 2 , arr[] = {1, 2, 3, 4, 5, 6, 7}
Output: 3 4 5 6 7 1 2

Input:  d = 4, arr[] = {3, 4, 5},
Output: 4 5 3
Rotating an array 4 times is effectively same as rotating it 4 – 3 = 1 time.

 */ 

 import java.util.*;
 public class q24_roatate_array_left{
   
   public static void reverse(int arr[],int i,int j){
 
     while(i<j){
     int temp=arr[i];
     arr[i]=arr[j];
     arr[j]=temp;
     i++;
     j--;
     }
    }
 
    public static void RightrotateArr(int arr[], int d, int n) {
      reverse(arr,0,n-1);
      reverse(arr,0,d-1);
      reverse(arr,d,n-1);
      
   }
    public static void leftrotateArr(int arr[], int d, int n) {
        reverse(arr,d,n-1);
        reverse(arr,0,d-1);
        reverse(arr,0,n-1);

     }
    
 
     public static void main(String args[]){
 
     Scanner sc=new Scanner(System.in);
 
     int size=sc.nextInt();
     int d=sc.nextInt();
 
     int arr[]=new int[size];
 
     for(int i=0;i<size;i++){
       arr[i]=sc.nextInt();
     }
     
  //  leftrotateArr(arr,d,size);
   RightrotateArr(arr,d,size);
   System.out.println("arr after rotation");
   for(int i=0;i<size;i++){
    System.out.print(arr[i]+ " ");
   }
      
     }
 }
 