/* Implement strstr
Difficulty: BasicAccuracy: 46.9%Submissions: 176K+Points: 1
Your task is to implement the function strstr. The function takes two strings as arguments (s,x) and  locates the occurrence of the string x in the string s. The function returns an integer denoting the first occurrence of the string x in s (0 based indexing).

Note: You are not allowed to use inbuilt function.

 

Example 1:

Input:
s = GeeksForGeeks, x = Fr
Output: -1
Explanation: Fr is not present in the
string GeeksForGeeks as substring.
 

Example 2:

Input:
s = GeeksForGeeks, x = For
Output: 5
Explanation: For is present as substring
in GeeksForGeeks from index 5 (0 based
indexing).
 

Your Task:
You don't have to take any input. Just complete the strstr() function which takes two strings str, target as an input parameter. The function returns -1 if no match if found else it returns an integer denoting the first occurrence of the x in the string s.

 

Expected Time Complexity: O(|s|*|x|)
Expected Auxiliary Space: O(1)

Note : Try to solve the question in constant space complexity.

 

Constraints:
1 <= |s|,|x| <= 100
//https://www.geeksforgeeks.org/problems/implement-strstr/1
*/

import java.util.*;
public class q42_CHeck_if_StringisSubStringOfAnother {
    public static int strstr(String s, String x)
    {
         if(s.contains(x)){
            return s.indexOf(x);
         }
         else{
         return -1;
         }
    }
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     String str=sc.nextLine();
     String x=sc.nextLine();

     System.out.print(strstr(str,x));
    }
}
