import java.util.*;

 public class MaximumSubArraySum{

  public static int kadanesAlgo(int arr[],int n){
   int sum=0;
   int maxSum=Integer.MIN_VALUE;
   for(int i:arr){
      sum+=i;
      maxSum=Math.max(maxSum,sum);
      if(sum<0) sum=0;
    }
    return maxSum;
  }
  
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);

  int n=sc.nextInt();
  int arr[]=new int[n];

  for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
   }
   System.out.print(kadanesAlgo(arr,n));
  }

 } 