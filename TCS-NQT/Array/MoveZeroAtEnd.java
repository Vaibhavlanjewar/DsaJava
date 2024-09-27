
import java.util.*;
public class MoveZeroAtEnd{

   public static void moveZero(int arr[]){
    int n=arr.length;
    int j=0;
    for(int i=0;i<n;i++){
       if(arr[i]!=0){
         arr[j++]=arr[i];
       }
    }
    while(j<n){
     arr[j++]=0;
    }
   }

   public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
   
    int arr[]=new int[n];

    for(int i=0;i<n;i++){
       arr[i]=sc.nextInt();
     }

    moveZero(arr);
  
    for(int i=0;i<n;i++){
       System.out.print(arr[i]+" ");
     }
  

  }

}