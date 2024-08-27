/* SUm of elements in an array  */

import java.util.*;
public class q22_sum_of_array_elements {
    public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    int sum=0;
    for(int i=0;i<n;i++){
     arr[i]=sc.nextInt();
     sum+=arr[i];
     }
     System.out.println(sum);
    
          
    }
}
