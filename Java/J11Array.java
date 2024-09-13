public class J11Array {
 public static void main(String args[]){
    int nums[]=new int[5];
    nums[0]=1;
    nums[1]=2;
    nums[2]=3;
    nums[3]=4;
    nums[4]=5;

    

    // update nums[0] 1 to 10
    nums[0]=10;
    for(int i=0;i<nums.length;i++){
        System.out.println(nums[i]);
    }
 }   
}
