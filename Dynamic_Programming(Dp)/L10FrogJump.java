/*
 Problem statement
There is a frog on the '1st' step of an 'N' stairs long staircase. The frog wants to reach the 'Nth' stair. 'HEIGHT[i]' is the height of the '(i+1)th' stair.If Frog jumps from 'ith' to 'jth' stair, the energy lost in the jump is given by absolute value of ( HEIGHT[i-1] - HEIGHT[j-1] ). If the Frog is on 'ith' staircase, he can jump either to '(i+1)th' stair or to '(i+2)th' stair. Your task is to find the minimum total energy used by the frog to reach from '1st' stair to 'Nth' stair.

For Example
If the given ‘HEIGHT’ array is [10,20,30,10], the answer 20 as the frog can jump from 1st stair to 2nd stair (|20-10| = 10 energy lost) and then a jump from 2nd stair to last stair (|10-20| = 10 energy lost). So, the total energy lost is 20.
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= T <= 10
1 <= N <= 100000.
1 <= HEIGHTS[i] <= 1000 .

Time limit: 1 sec
Sample Input 1:
2
4
10 20 30 10
3
10 50 10
Sample Output 1:
20
0
Explanation of sample input 1:
For the first test case,
The frog can jump from 1st stair to 2nd stair (|20-10| = 10 energy lost).
Then a jump from the 2nd stair to the last stair (|10-20| = 10 energy lost).
So, the total energy lost is 20 which is the minimum. 
Hence, the answer is 20.

For the second test case:
The frog can jump from 1st stair to 3rd stair (|10-10| = 0 energy lost).
So, the total energy lost is 0 which is the minimum. 
Hence, the answer is 0.
Sample Input 2:
2
8
7 4 4 2 6 6 3 4 
6
4 8 3 10 4 4 
Sample Output 2:
7
2


Hints:
1. Think about all the possibilities at each stair.
2. Using recursion, try to divide the problem into subproblems and calculate the answer for each subproblem only once - store it for reusing in the future.
3. The above can also be done iteratively.
 */
import java.util.* ;
import java.io.*; 
public class L10FrogJump {
    public static int recMemo(int ind,int height[],int dp[]){
        if(ind==0)return 0;
        if(dp[ind]!=-1){
            return dp[ind];
        }
        int left=recMemo(ind-1,height,dp)+Math.abs(height[ind]-height[ind-1]);
        int right=Integer.MAX_VALUE;
        if(ind>1){
           right=recMemo(ind-2,height,dp)+Math.abs(height[ind]-height[ind-2]);
        }
        return dp[ind]=Math.min(left,right);
    }
    public static int frogJump(int n, int heights[]) {
      // memoization
       int dp[]=new int[n+1];
       Arrays.fill(dp,-1);
    //    return recMemo(n-1,heights,dp);

    //   tabualtion 
    //     int dp[]=new int[n];
    //    Arrays.fill(dp,0);
    //      dp[0]=0;
    //      for(int i=1;i<n;i++){
    //          int left=dp[i-1]+Math.abs(heights[i]-heights[i-1]);
    //          int right=Integer.MAX_VALUE;
    //          if(i>1){
    //             right=dp[i-2]+Math.abs(heights[i]-heights[i-2]);
    //          }
    //         dp[i]=Math.min(left,right);
    //      }
    //       return dp[n-1];


    //tabulation without using space , spca optimization

        int prev1=0;
        int prev2=0;
         for(int i=1;i<n;i++){
             int left=prev1+Math.abs(heights[i]-heights[i-1]);
             int right=Integer.MAX_VALUE;
             if(i>1){
                right=prev2+Math.abs(heights[i]-heights[i-2]);
             }
           int curr=Math.min(left,right);
            prev2=prev1;
            prev1=curr;
         }
          return prev1;

        
    }

    public static void main(String[] args) {
        int heights[]={7 ,4,4, 2, 6, 6, 3, 4 };
        int n=heights.length;
        System.out.println(frogJump(n,heights));//7
    }

}