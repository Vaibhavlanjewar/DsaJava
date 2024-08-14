public class NumberOf_good_pair {
    public int numIdenticalPairs(int[] nums) {
        //    https:leetcode.com/problems/number-of-good-pairs/description/ // 
            int n=0;
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]==nums[j]){
                        n++;
                    }
                }
            }
            
            return n;
        }
}
