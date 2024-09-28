import java.util.*;
public class TwoSum{
  
 public static ArrayList<Integer>twoSum(int arr[],int target){
   HashMap<Integer,Integer>mp=new HashMap<>();

   ArrayList<Integer>res=new ArrayList<>();
   for(int i=0;i<arr.length;i++){
     int more=target-arr[i];
     if(mp.containsKey(more)){
       res.add(i);
      res.add(mp.get(more));
     
      break;
     }
     mp.put(arr[i],i);
    }
    return res;
  }  

  public static int targetPresent(int arr[],int target){
   Arrays.sort(arr);
   int si=0,ei=arr.length-1;

  while(si<=ei){
   int sum=arr[si]+arr[ei];
    if(sum==target){
       return 1;
    } 
    else if(sum<target)si++;
    else ei--;
 
  }
  return -1;
  
  }

 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);

  int n=sc.nextInt();
  int target=sc.nextInt();
  int arr[]=new int[n];
  for(int i=0;i<n;i++){
   arr[i]=sc.nextInt();
  }
  //TCS 
  ArrayList<Integer>res=twoSum(arr,target);
  System.out.print(res);
  
  // is target present if yes -return 1 else -1
  System.out.print(targetPresent(arr,target));
  
   
 }
  
}