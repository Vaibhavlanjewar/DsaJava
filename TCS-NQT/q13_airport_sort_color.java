/*Q1. Airport security officials have confiscated several items of the passenger at the security checkpoint. All 
the items have been dumped into a huge box(array). Each item possessed a certain amount of risk(0,1,2). 
Here is the risk severity of the item representing an array[] of N number of integer values. The risk here is to 
sort the item based on their level of risk values range from 0 to 2. 
Example 1: 
Input: 
7     ----- Value of N 
[1,0,2,0,1,0,2] -> Element of arr[0] to arr[N-1], while input each element is separated by new line 
Output: 
0 0 0 1 1 2 2 -> Element after sorting based on the risk severity.   
Example 2: 
Input: 
10     ----- Value of N 
[2,1,0,2,1,0,0,1,2,0] -> Element of arr[0] to arr[N-1], while input each element is separated by new line 
Output: 
0 0 0 0 0 1 1 1 2 2 2 -> Element after sorting based on the risk severity.   
Constraints 
0<N<=100 
0<=arr[i]<=2  */


import java.util.*;
public class q13_airport_sort_color {


    public static  void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void sort(int nums[]){
    int index=0,end=nums.length-1,start=0;
    
    while(index<=end){
    if(nums[index]==0){
     swap(nums,index,start);
     index++;
     start++;
    } 

    else if( nums[index]==2 ){
      swap(nums,index,end);
      end--;
    }
    else{
     index++; //skip 1
    }
 
    }

   }

   public static void main(String args[]){
  
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
  int nums[]=new int [n];
   for(int i=0;i<n;i++){
    nums[i]=sc.nextInt();
   } 
  
   sort(nums);
   for(int i=0;i<n;i++){
   System.out.print(nums[i]+ " " );
   }
  }
}

    /*7
1 0 2 0 1 0 2
0 0 0 1 1 2 2 */
