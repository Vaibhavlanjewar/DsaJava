import java.util.*;
public class MissingNo{

public static int missNo(int arr[]){
  int n=arr.length;
  int totsum=n*(n+1)/2;
  int sum=0;
  for(int i:arr){
    sum+=i;
   }
   return totsum-sum;
  }
public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int arr[]=new int[n];

   for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
   }
   System.out.println(missNo(arr));
  }

}