/*Remove all duplicates from a given string
 Given a string str which may contain lowercase and uppercase characters. The task is to remove all duplicate characters from the string and find the resultant string. The order of remaining characters in the output should be same as in the original string.

Example 1:

Input:
str = "geEksforGEeks"
Output: 
"geEksforG"
Explanation: 
After removing duplicate characters such as E, e, k, s, we have string as "geEksforG".
Example 2:

Input:
str = "HaPpyNewYear"
Output: 
"HaPpyNewYr"
Explanation: 
After removing duplicate characters such as e, a, we have string as "HaPpyNewYr".
Your Task:
Complete the function removeDuplicates() which takes a string str, as input parameters and returns a string denoting the answer. You don't have to print answer or take inputs.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 ≤ N ≤ 105
String contains uppercase and lowercase english letters.
 */
// https://www.geeksforgeeks.org/problems/remove-all-duplicates-from-a-given-string4321/1
import java.util.*;
public class q42_RemoveDuplicatesFromString {
    public static String removeDuplicates(String str){
          LinkedHashSet<Character>set=new LinkedHashSet<>();
          for(char ch:str.toCharArray()){
            set.add(ch);
           }
          StringBuilder sb=new StringBuilder();
          for(char c:set){
            sb.append(c);
          }
          return sb.toString();
      }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.print(removeDuplicates(str));
    }
}
