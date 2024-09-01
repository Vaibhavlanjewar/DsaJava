/* Anagram
 Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, act and tac are an anagram of each other. Strings a and b can only contain lower case alphabets.

Note:-

If the strings are anagrams you have to return True or else return False

|s| represents the length of string s.


Example 1:

Input:a = geeksforgeeks, b = forgeeksgeeks
Output: YES
Explanation: Both the string have same characters with
        same frequency. So, both are anagrams.
Example 2:

Input:a = allergy, b = allergic
Output: NO
Explanation: Characters in both the strings are 
        not same, so they are not anagrams.
Your Task:
You don't need to read input or print anything. Your task is to complete the function isAnagram() which takes the string a and string b as input parameter and check if the two strings are an anagram of each other. The function returns true if the strings are anagram else it returns false. The driver code will print YES is the function returns true, else print NO.

Expected Time Complexity:O(|a|+|b|).
Expected Auxiliary Space: O(Number of distinct characters).

Constraints:
1 ≤ |a|,|b| ≤ 105
 */


import java.util.Arrays;
import java.util.Scanner;

public class q40_AnaGram {
    public static boolean isAnagram(String a, String b) {

        // Your code here
        if(a.length()>b.length() || a.length()<b.length()) return false;
       char[]s1=a.toCharArray();
       char[]s2=b.toCharArray();
       Arrays.sort(s1);
       Arrays.sort(s2);
       for(int i=0;i<a.length();i++){
           if(s1[i]!=s2[i]){
               return false;
           }
       }
        return true;
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str1=sc.nextLine();
    String str2=sc.nextLine();
    System.out.print(isAnagram(str1,str2));
   }
}

