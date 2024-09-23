
import java.util.*;
public class Iplace{

public static int longestSubArray(int nums[],int n,int k){
   HashMap<Integer,Integer>mp=new HashMap<>();

   int sum=0,maxLength=Integer.MIN_VALUE;
 
   for(int i=0;i<n;i++){
      sum+=nums[i];
      if(sum==k) maxLength=i+1;

      int res=sum-k;
      if(mp.containsKey(res)){
        int l=i-mp.get(res);
        maxLength=Math.max(maxLength,l);
      }
      
      if(!mp.containsKey(sum)){
      mp.put(sum,i);
      }
   
   }   
   return maxLength;

   }
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int nums[]=new int[n];

    for(int i=0;i<n;i++){
      nums[i]=sc.nextInt();
     }
     System.out.println(longestSubArray(nums,n,k));
    
    }
}