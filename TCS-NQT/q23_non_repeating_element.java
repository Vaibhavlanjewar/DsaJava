/* Non-Repeating Element
Find the first non-repeating element in a given array arr of integers and if there is not present any non-repeating element then return 0

Note: The array consists of only positive and negative integers and not zero.

Examples:

Input: arr[] = [-1, 2, -1, 3, 2]
Output: 3
Explanation: -1 and 2 are repeating whereas 3 is the only number occuring once. Hence, the output is 3. 


*/

import java.util.*;
public class q23_non_repeating_element{
    public static int firstNonRepeating(int[] arr) {
       HashMap<Integer,Integer>mp=new HashMap<>();

       for(int i=0;i<arr.length;i++){
        mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);

        }
         
        for(int i=0;i<arr.length;i++){
         if(mp.get(arr[i])==1){
           return arr[i];
          }
 
         }
        return -1;

    }

   public static void main(String args[]){

     Scanner sc=new Scanner(System.in);
     int size=sc.nextInt();
     int arr[]=new int[size];

     for(int i=0;i<size;i++)
       arr[i]=sc.nextInt();
      
    
     System.out.print(firstNonRepeating(arr));
}

}