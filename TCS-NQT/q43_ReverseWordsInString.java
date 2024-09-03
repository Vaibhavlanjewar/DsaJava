/*Reverse Words

Difficulty: EasyAccuracy: 56.08%Submissions: 320K+Points: 2
Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

https://www.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1

Example 1:

Input:
S = i.like.this.program.very.much
Output: much.very.program.this.like.i
Explanation: After reversing the whole
string(not individual words), the input
string becomes
much.very.program.this.like.i
Example 2:

Input:
S = pqr.mno
Output: mno.pqr
Explanation: After reversing the whole
string , the input string becomes
mno.pqr

Your Task:
You dont need to read input or print anything. Complete the function reverseWords() which takes string S as input parameter and returns a string containing the words in reversed order. Each word in the returning string should also be separated by '.' 


Expected Time Complexity: O(|S|)
Expected Auxiliary Space: O(|S|)


Constraints:
1 <= |S| <= 105

 
 */
import java.util.*;
public class q43_ReverseWordsInString {
    public static String reverseWords(String S){
        S+=".";

        String [] str=S.split("\\.");
      //   reverse string 
        int i=0,j=str.length-1;
        while(i<j){
         String temp=str[i];
         str[i]=str[j];
         str[j]=temp;
        i++;
        j--;
         }
         
      //    add . to  string 
        StringBuilder sb=new StringBuilder();
         int n=str.length;
        for(int k=0;k<n;k++){
         sb.append(str[k]);
         if(k<n-1){
         sb.append(".");
         }
         
        }
        return sb.toString();
    }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       System.out.print(reverseWords(str));
    }
}
