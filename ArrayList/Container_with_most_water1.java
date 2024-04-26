import java.util.ArrayList;

public class Container_with_most_water1 {
    public static int storeWater(ArrayList<Integer>height){
        int maxWater=0;
        int n=height.size();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int ht=Math.min(height.get(i),height.get(j));
                int width=j-i;
                int currWater=ht*width;     // 0(n2) time complexity 
                maxWater=Math.max(maxWater,currWater);
            }
        }
        return maxWater;
    }
    public static int storeWater2ptr(ArrayList<Integer>height){
        int maxWater=0;
        int lp=0,rp=height.size()-1;
        while(lp<rp){
            int ht=Math.min(height.get(lp),height.get(rp));
            int width=rp-lp;
            int currWater=ht*width;  // 0(n)
            maxWater=Math.max(maxWater,currWater);

            // ptr update 
            if(height.get(lp)<height.get(rp)) lp++;
            else rp--;

        }
        return maxWater;
    }
    public static void main(String args[]){
        ArrayList<Integer>height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

      //  System.out.println("Maxwater: "+ storeWater(height));
      System.out.println("MaxWater in container : "+ storeWater2ptr(height));
   
    }
}


// leetcode 11 
 //   https://leetcode.com/problems/container-with-most-water/submissions/1241773892/
//  public int maxArea(int[] height) {
//     int maxWater=0;
//    int lp=0,rp=height.length-1;
//    while(lp<rp){
       
//        int ht=Math.min(height[lp],height[rp]); // 0(n)  vnbl
//        int width=rp-lp;
//        int currWater=ht*width;
//        maxWater=Math.max(maxWater,currWater);

//        // ptr update 
//        if(height[lp]<height[rp]) lp++;
//        else rp--;

//    }
//    return maxWater;
// }