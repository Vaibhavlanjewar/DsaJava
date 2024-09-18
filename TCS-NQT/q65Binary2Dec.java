/*Binary number to decimal number
Difficulty: BasicAccuracy: 51.5%Submissions: 63K+Points: 1
Given a Binary Number B, find its decimal equivalent.
 

Example 1:

Input: B = 10001000
Output: 136
Example 2:

Input: B = 101100
Output: 44 */

public class q65Binary2Dec{
    public static void main(String[] args) {
        String str="10001000";
        int res=0;
        int n=str.length();
        for(int i=0;i<n;i++){
        
           int no = str.charAt(i) - '0'; 
            int pow=(int)Math.pow(2,n-i-1);
            res+=pow*no;
        }
        System.out.println(res);
    }
}