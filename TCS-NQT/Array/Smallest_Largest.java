public class Smallest_Largest {
    public static int smallest(int nums[]){
        int smallest=nums[0];
        for(int i:nums){
            if(i<smallest){
                smallest=i;
            }
        }
        return smallest;
    }
    public static int secondLargest(int nums[]){
        int largest=Integer.MIN_VALUE;
        int secLargest=Integer.MIN_VALUE;

        for(int i:nums){
            if(i>largest){
                secLargest=largest;
                largest=i;
            }
            if(i>secLargest && i<largest){
                secLargest=i;
            }
        }
        return secLargest==Integer.MIN_VALUE?-1:secLargest;
    }
    public static int largest(int nums[]){
        int largest=0;
        for(int i:nums){
            if(i>largest){
                largest=i;
            }
        }
        return largest;
    }
    public static int secondSmallest(int nums[]){
        int secSmallest=Integer.MAX_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i:nums){
            if(i<smallest){
                secSmallest=smallest;
                smallest=i;
            }
            if(i > smallest && i < secSmallest){  //
                secSmallest=i;
            }
        }
        return secSmallest==Integer.MAX_VALUE?-1:secSmallest;
    }
    public static void main(String args[]){
        int nums[]={2,3,5,1,6,4,9};
        System.out.println("smallest: "+smallest(nums));
        System.out.println("Largest: "+largest(nums));
        System.out.println("Second largest: "+secondLargest(nums));
        System.out.println("Second smallest: "+secondSmallest(nums));
    }
}
