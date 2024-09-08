public class L3_ClimbingStairs_123steps {
    // steps are given 1, 2 ,3
    public static int countWays(int n){
        if(n==0) return 1;
        if(n<0)return 0;
        return countWays(n-1)+countWays(n-2)+countWays(n-3);
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(countWays(n));
    }
}
