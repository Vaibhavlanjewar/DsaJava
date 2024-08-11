import java.util.ArrayList;
import java.util.HashMap;

// https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&category=Arrays,Strings&difficulty=School,Basic,Easy,Medium&sortBy=submissions
public class  index_of_subarray_sum_med_gfg {
    
    public static void main(String args[]){
     int arr[]={1,2,3,7,5};
     int s=12;
     int n=5;
     ArrayList<Integer>res= subarraySum(arr, n, s);
     System.out.println(res.toString());
    }

    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
       HashMap<Integer,Integer>presum=new HashMap<>();
       ArrayList<Integer>ans=new ArrayList<>();
       int sum=0;
       for(int i=0;i<n;i++){
           sum+=arr[i];
           if(sum==s){
            ans.add(1);
            ans.add(i+1);
            return ans;
           }
           int rem=sum-s;
           if(presum.containsKey(rem)){
            ans.add(presum.get(rem)+1);
            ans.add(i+1);
            return ans;
         }
           if(!presum.containsKey(sum)){
            presum.put(sum,i+1);
           }
      
    }
    if(ans.isEmpty()){
        ans.add(-1);
        return ans;
    }
    else{
        return ans;
    }
}
}
