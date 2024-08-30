import java.util.*;

public class BinarySearch{

public static int BinarySearch(int arr[],int key){
  int i=0,j=arr.length-1;
  while(i<=j){
  int mid=(i+j)/2;
  if(arr[mid]==key){
   return mid;
  }
  else if(arr[mid]<key){
      i=mid+1;
  }
  else{
   j=mid-1;
   }

  }
  return -1;
}
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int size=sc.nextInt();
//enter a size for an arr 
  int arr[]=new int[size];
  for(int i=0;i<size;i++){
  arr[i]=sc.nextInt();
 } 
//enter a key 
 int key=sc.nextInt();
 System.out.print(BinarySearch(arr,key));
}

}
