/*
Reverse a String

You are given a string s. You need to reverse the string.

Example 1:

Input:
s = Geeks
Output: skeeG
Example 2:

Input:
s = for
Output: rof
Your Task:

You only need to complete the function reverseWord() that takes s as parameter and returns the reversed string.

Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(1).

Constraints:
1 <= |s| <= 10000

*/


import java.util.*;  
public class q36_reverseString{
      public static String reverseWord(String str){
       char ch[]=str.toCharArray();
       int i=0,j=ch.length-1;
       while(i<j){
           char temp=ch[i];
           ch[i]=ch[j];
           ch[j]=temp;
           i++;
           j--;
         }
        StringBuilder sb=new StringBuilder();
        for(char c:ch){
          sb.append(c);
        }
        return sb.toString();
      }

   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    System.out.print(reverseWord(str));
   }
}
