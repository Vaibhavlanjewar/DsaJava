
import java.util.*;
public class SecLargest{

public static int SecSmallest(int nums[]){

   int smallest=Integer.MAX_VALUE;
int secSmallest=Integer.MAX_VALUE;
   
   for(int i:nums){

    if(i<smallest){
     secSmallest=smallest;
     smallest=i;
    }
    if(i>smallest && i<secSmallest){
     secSmallest=i;
    }
    
    }

    return secSmallest;
  }

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int nums[]=new int[n];

    for(int i=0;i<n;i++){
      nums[i]=sc.nextInt();
     }
     System.out.println(SecSmallest(nums));
    
    }
}