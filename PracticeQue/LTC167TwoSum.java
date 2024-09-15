public class LTC167TwoSum {

        public static int[] twoSum(int[] numbers, int target) {
        //     int si=0,ei=numbers.length-1;
        //     int res[]=new int[2];
        //     while(si<=ei){
        //         int sum=numbers[si]+numbers[ei];
        //         if(sum==target){ 
        //             res[0]=si+1;
        //             res[1]=ei+1;
        //             break;
        //         }
        //         else if(sum<target){
        //              si++;
        //         }
        //         else{
        //             ei--;
        //         }
        //     }
        //    return res;
    
            int si=0,ei=numbers.length-1;
          while(numbers[ei]+numbers[si]!=target){
            if(numbers[si]+numbers[ei]<target) si++;
            else ei--;
          }    
          return new int[] {si+1,ei+1};
        }
    
    public static void main(String[] args) {
        int numbers[]={2,7,11,15};
        int target=9;
        int res[]=twoSum(numbers,target);
         for(int i:res){
            System.out.println(i);
         }
    }
}
