
/* Nth Natural Number
Difficulty: MediumAccuracy: 29.99%Submissions: 56K+Points: 4
Given a positive integer n. You have to find nth natural number after removing all the numbers containing the digit 9.

Examples :

Input: n = 8
Output: 8
Explanation: After removing natural numbers which contains digit 9, first 8 numbers are 1,2,3,4,5,6,7,8 and 8th number is 8.
Input: n = 9
Output: 10
Explanation: After removing natural numbers which contains digit 9, first 9 numbers are 1,2,3,4,5,6,7,8,10 and 9th number is 10.
Expected Time Complexity: O(logn)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ n ≤ 10^9
https://www.geeksforgeeks.org/problems/nth-natural-number/1
*/
import java.util.*;
public class q46_FindNthNaturalNumber_AfterRemovingNine {

    public static long findNth(long n){
        long res=0;
        long place=1;

        while(n>0){
            res+=(n%9)*place;
            n/=9;
            place*=10;

        }
        return res;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        System.out.println(findNth(n));

    }

}
