/*
Remove all characters other than alphabets
Difficulty: BasicAccuracy: 46.16%Submissions: 16K+Points: 1
Given a string S, remove all the characters other than the alphabets.

Example 1:

Input: S = "$Gee*k;s..fo, r'Ge^eks?"
Output: GeeksforGeeks
Explanation: Removed charcters other than
alphabets. 
 

Example 2:

Input:  S = "{{{}}> *& ^%*)"
Output: -1
Explanation: There are no alphabets.
 

Your Task:
You don't need to read input or print anything. Your task is to complete the function removeSpecialCharacter() which takes string S as input parameter and returns the resultant string. Return "-1" if no alphabets remain.

 

Expected Time Complexity: O(|s|)
Expected Auxiliary Space: O(|s|)

 

Constraints:
1 <= |S| <= 105 */


import java.util.*;
public class q35_removeAllChar {
     public static String removeSpecialCharacter(String s) {
           StringBuilder sb=new StringBuilder();
           for(char i:s.toCharArray()){
              if((i>='a' && i<='z') || (i>='A' && i<='Z')){
                 sb.append(i);
                    }
             }
             return sb.length()==0?"-1":sb.toString();
    }

   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    System.out.print(removeSpecialCharacter(str));
   }
}
