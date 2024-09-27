import java.util.*;
  public class RotateArrayByKStep{
   
    public static void reverse(int arr[],int si,int ei){
     while(si<ei){
        int temp=arr[si];
        arr[si]=arr[ei];
        arr[ei]=temp;
        ei--;
        si++;
     }

    }

    public static void rotateByKStep(int arr[],int k){
      int n=arr.length;

      k=k%n;
      reverse(arr,0,n-1);
      reverse(arr,0,k-1);
      reverse(arr,k,n-1);
 
    }
   
    public static void main(String args[]){

     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int k=sc.nextInt();

     int arr[]=new int[n];
     for(int i=0;i<n;i++){
       arr[i]=sc.nextInt();
      }
     rotateByKStep(arr,k);

    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");      

     }

     
    }

 }