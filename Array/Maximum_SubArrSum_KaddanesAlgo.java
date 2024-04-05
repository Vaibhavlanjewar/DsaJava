public class Maximum_SubArrSum_KaddanesAlgo {
    public static void kaddanes(int num []){
        //https://leetcode.com/problems/maximum-subarray/
        int ms=Integer.MIN_VALUE; // maximum sum 
        int cs=0;  // Current sum 
        for(int i=0;i<num.length;i++){
            cs=cs +num[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("Maximum sum : "+ ms);
    }

    public static void main(String args[]){
        int num[]={-2,-3,4,-1,-2,1,5,-3};
        kaddanes(num);
    }
}
