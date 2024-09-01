/*
Palindrome String
//https://www.geeksforgeeks.org/problems/palindrome-string0817/1
Input: S = "abc" 
Output: 0
Explanation: S is not a palindrome
Your Task:
You don't need to read input or print anything. Complete the function isPalindrome()which accepts string S and returns an integer value 1 or 0.

Expected Time Complexity: O(Length of S)
Expected Auxiliary Space: O(1)

Constraints:
1 <= Length of S<= 2*105 */


import java.util.*;
public class q32_palindromString {
  public static int isPalindrome(String S) {
     int i=0,j=S.length()-1;
     while(i<=j){ 
        if(S.charAt(i)!=S.charAt(j)){
           return 0;
          }
          i++;
          j--;
       }
     return 1;
    }

   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    System.out.print(isPalindrome(str));
   }
}
