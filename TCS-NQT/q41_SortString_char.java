/*Sort a String
Difficulty: BasicAccuracy: 64.43%Submissions: 30K+Points: 1
Given a string consisting of lowercase letters, arrange all its letters in ascending order. 

Example 1:

Input:
S = "edcab"
Output: "abcde"
Explanation: characters are in ascending
order in "abcde".
Example 2:

Input:
S = "xzy"
Output: "xyz"
Explanation: characters are in ascending
order in "xyz".


Your Task:  
You don't need to read input or print anything. Your task is to complete the function sort() which takes the string as inputs and returns the modified string.

Expected Time Complexity: O(|S| * log |S|)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ |S| ≤ 105
S contains only lowercase alphabets. */
// https://www.geeksforgeeks.org/problems/sort-a-string2943/1

import java.util.*;
public class q41_SortString_char {
    public static String sort(String s){
        char ch[]=s.toCharArray();
        Arrays.sort(ch);

        String b = new String(ch);
        return b;
     }
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();

      System.out.print(sort(str));
     }
}
