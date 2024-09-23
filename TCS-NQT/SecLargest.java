
import java.util.*;
public class SecLargest{

public static int SecLargest(int nums[]){

   int largest=Integer.MIN_VALUE;
int secLargest=Integer.MIN_VALUE;
   
   for(int i:nums){

    if(i>largest){
     secLargest=largest;
     largest=i;
    }
    if(i>secLargest && i<largest){
     secLargest=i;
    }
    
    }

    return secLargest;
  }

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int nums[]=new int[n];

    for(int i=0;i<n;i++){
      nums[i]=sc.nextInt();
     }
     System.out.println(SecLargest(nums));
    
    }
}