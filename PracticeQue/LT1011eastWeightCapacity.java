public class LT1011eastWeightCapacity{
    public static int maxi(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i:nums){
           max=Math.max(max,i);
        }
        return max;
    }
    public static int sum(int weights[]){
        int sum=0;
        for(int w :weights) {
            sum+=w;
        }
        return sum;
    }
    public static int findDay(int []weights,int cap){
        int day=1, load=0;
        for(int i=0;i<weights.length;i++){
            if(weights[i]+load>cap){
                day+=1;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }
        }
        return day;
    }
     public static int shipWithinDays(int[] weights, int days) {
        
        int low = maxi(weights);
        int high=sum(weights);
        while (low <= high) {
            int mid = (low + high) / 2;
            int numOfDay=findDay(weights,mid);
            if (numOfDay<= days) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }
        return low;
    }   
    
    public static void main(String args[]){
        int weights[]={1,2,3,4,5,6,7,8,9,10};
        int days=5;
        System.out.println(shipWithinDays(weights,days));
    }
}

