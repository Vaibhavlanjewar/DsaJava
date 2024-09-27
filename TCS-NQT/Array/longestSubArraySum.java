public class longestSubArraySum {
    public static int longsubarraysum(int arr[],int k){
        HashMap<Integer,Integer>mp=new HashMap<>();

        int sum=0;
        int maxLength=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                maxLength=Math.max(maxLength,i+1);
            }
            int rem=sum-k;
            if(mp.containsKey(rem)){
                int len=i-mp.get(rem);
                maxLength=Math.max(maxLength,len);
            }
            if(!mp.containsKey(sum)){
                mp.put(sum,i);
            }
        }

        return maxLength;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,1,1,1,1,4,2,3};
        int k=3;
        System.out.println(longsubarraysum(arr,k));
    }
}
