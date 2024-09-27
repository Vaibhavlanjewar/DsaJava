import java.util.*;

public class LinearSearch{

  public static int linearSearch(int arr[],int key){
   for(int i=0;i<arr.length;i++){
    if(arr[i]==key){
     return i+1;
     }
   }
   return -1;
  }


 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    int arr[]=new int[n];
    int key=sc.nextInt();

    for(int i=0;i<n;i++){
     arr[i]=sc.nextInt();
    }

    System.out.print(linearSearch(arr,key));
 }

}