import java.util.*;
public class CheckArraySortedandRotated{

  public static boolean checkSortedandRotated(int arr[]){
   int n=arr.length;
   if(arr[0]<arr[n-1]){
      return false;
    }

   int cnt=0;
   for(int i=0;i<n-1;i++){
    if(arr[i]>arr[i+1]){
      cnt++;
     }
   }
   if(cnt>1) return false;
   return true;
  }

 public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();

   int arr[]=new int[n];
   for(int i=0;i<n;i++){
     arr[i]=sc.nextInt();
    }

   System.out.print(checkSortedandRotated(arr));
  }

}