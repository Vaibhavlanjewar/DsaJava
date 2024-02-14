class rearrangeArrayBy_sign {
    // https://leetcode.com/problems/rearrange-array-elements-by-sign/?envType=daily-question&envId=2024-02-14
    public int[] rearrangeArray(int[] nums) {
          int s=nums.length;
        int [] p=new int[s/2];
        int [] n=new int[s/2];
        int k=0;
        int j=0;

        for(int i=0;i<s;i++){
            if(nums[i]>=0){
                p[k++]=nums[i];
            }
        }
        for(int i=0;i<s;i++){
           if(nums[i]<0) {
            n[j++]=nums[i];
           }
          }
        //   i=0;
        for(int i=0;i<s;i++){
            if(i%2==0) nums[i]=p[i/2/2];
            else nums[i]=n[i];
        }
        return nums;
    }
}