
import java.util.*;
public class gfg_MinimumCostOfRopes {

 public static long minCost(long[] arr) {
        // code here
     PriorityQueue<Long>pq=new PriorityQueue<>();
     for(long i:arr){
      pq.add(i);
     }

     long maxSum=0;
     while(pq.size()!=1){
        int k=2;
        long sum=0;
        if(pq.size()==1){
            k=1;
        }
        while(k>0 && !pq.isEmpty()){
          sum+=pq.poll();
          k--;
        } 
        maxSum+=sum;  
        pq.add(sum);
      
     }     
     return maxSum; 
    }
public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   long arr[]=new long[n];
   
    for(int i=0;i<n;i++){
      arr[i]=sc.nextLong();
   }
   
   System.out.print(minCost(arr));
  

}    
}
