
/*
Remove character

//https://www.geeksforgeeks.org/problems/remove-character3815/1
Difficulty: BasicAccuracy: 59.6%Submissions: 47K+Points: 1
Given two strings string1 and string2, remove those characters from first string(string1) which are present in second string(string2). Both the strings are different and contain only lowercase characters.
NOTE: Size of  first string is always greater than the size of  second string( |string1| > |string2|).
 

Example 1:

Input:
string1 = "computer"
string2 = "cat"
Output: "ompuer"
Explanation: After removing characters(c, a, t)
from string1 we get "ompuer".
Example 2:

Input:
string1 = "occurrence"
string2 = "car"
Output: "ouene"
Explanation: After removing characters
(c, a, r) from string1 we get "ouene". */


import java.util.*;
public class q34_removeCharacter {
    static String removeChars(String string1, String string2){
        // code here
        HashSet<Character>set=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<string2.length();i++){
            set.add(string2.charAt(i));
        }
         for(int i=0;i<string1.length();i++){
            if(!set.contains(string1.charAt(i))){
                sb.append(string1.charAt(i));
            }
        }
        return sb.toString();
    }

   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str1=sc.nextLine();
    String str2=sc.nextLine();
    System.out.print(removeChars(str1,str2));
   }
}
