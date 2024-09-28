import java.util.*;
public class MajorityNby2El{

 public static int majoritEl(int arr[]){
 HashMap<Integer,Integer>mp=new HashMap<>();
  int n=arr.length;
 for(int i=0;i<n;i++){
  mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
   if(mp.get(arr[i])>n/2)return arr[i];
  }
  return -1;
 }
  
 public static int mooreVotingAlgo(int arr[]){
   int n=arr.length;
   int el=arr[0];
   int cnt=0;

// first find the el who is repeated more 
   for(int i=0;i<n;i++){
    if(cnt==0){
     cnt=1;
     el=arr[i];
    }
    else if(arr[i]==el) cnt++;
    else cnt --;
   }
  
   //check count of el >n/2 
   int cnt1=0;
   for(int i:arr){
    if(i==el) cnt1++;
   }
   if(cnt1>n/2)return el;
    return -1;   

 }

 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);

  int n=sc.nextInt();
  int arr[]=new int[n];

  for(int i=0;i<n;i++){
   arr[i]=sc.nextInt();
  }

  System.out.print(majoritEl(arr));

 }

}