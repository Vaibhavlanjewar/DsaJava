public class ltc_2460_operation_on_arr {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        int []res=new int[n];
      
     
       int j=0;
       for(int i=0;i<n;i++){
           if(i<n-1 && nums[i]==nums[i+1]){
            nums[i]*=2;
             nums[i+1]=0;
           }
           if(nums[i]!=0){
            res[j++]=nums[i];
           }
       }
      
        
       return res;
}
}
