//arline .. sort colors 
import java.util.*;
public class SortColor75{

  public static void swap(int arr[],int i,int j){
   int temp=arr[i];
   arr[i]=arr[j];
   arr[j]=temp;
  
  }

  public static void sortColor(int arr[]){
   // Arrays.sort(arr); // for online submission okay 

   // for interview explaination 
   int i=0,e=arr.length-1,si=0;

   while(i<e){
    if(arr[i]==0){
     swap(arr,i,si);
     i++;
     si++;
    }
    else if(arr[i]==2){ // arr[si]==0
    swap(arr,i,e);
     e--;
     }
    else{
         // arr[si]==1 skipp ,si
       i++;
     }
   }
   
   
  }

 public static void main(String args[]){
 
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();

  int arr[]=new int[n];
  for(int i=0;i<n;i++){
   arr[i]=sc.nextInt();
  }
    
  sortColor(arr);

  for(int i:arr) System.out.print(i+" ");
 }

}