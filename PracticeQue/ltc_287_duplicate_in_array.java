import java.util.HashMap;
// https://leetcode.com/problems/find-the-duplicate-number/description/
public class ltc_287_duplicate_in_array {
    public static int findDuplicate(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int res=0;
        for(int i :nums){
            if(mp.get(i)>1){
             res=i;
            }
        }
       return res;
      
    } 

    public static void main(String[] args) {
        int[] nums = {1,3,4,2};
        System.out.println(findDuplicate(nums));
    }

}


