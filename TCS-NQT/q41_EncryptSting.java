/*Encrypt the string - 1
Difficulty: BasicAccuracy: 36.55%Submissions: 15K+Points: 1
Bingu was testing all the strings he had at his place and found that most of them were prone to a vicious attack by Banju, his arch-enemy. Bingu decided to encrypt all the strings he had, by the following method. Every substring of identical letters is replaced by a single instance of that letter followed by the number of occurrences of that letter. Then, the string thus obtained is further encrypted by reversing it.

Example 1:
// https://www.geeksforgeeks.org/problems/encrypt-the-string-10337/1
Input:
s = "aabc"
Output: 1c1b2a
Explanation: aabc
Step1: a2b1c1
Step2: 1c1b2a
Example 2:

Input:
s = "aaaaa"
Output: 5a
Explanation: aaaaa
Step 1: a5
Step 2: 5a

input : aabaac , op: 1c2a1b2a
Your Task:
You don't need to read input or print anything.Your task is to complete the function encryptString() which takes a single argument(s) and returns the encrypted string.

Expected Time Complexity: O(|s|).
Expected Auxiliary Space: O(|s|).

Constraints
1 <= |s| <=1000

|s| denotes the length of the string s */

import java.util.*;
public class q41_EncryptSting {
    public static String encryptString(String s) 
    {
    //    HashMap<Character,Integer>mp=new HashMap<>();  HashSet<Character>set=new HashSet<>();
    //    StringBuilder sb=new StringBuilder();
       
    //    for(char ch:s.toCharArray()){
    //        mp.put(ch,mp.getOrDefault(ch,0)+1);
          
    //     }

    //    for(int i=s.length()-1;i>=0;i--){
    //        char ch=s.charAt(i);
    //        if(mp.containsKey(ch)){
    //        String a=Integer.toString(mp.get(ch));
           
    //        sb.append(a+ch);
    //        mp.remove(ch);

    //        }
    //     }
    //     return sb.toString();


   StringBuilder sb=new StringBuilder();
   s=s+" ";
   char ch[]=s.toCharArray();
   int count=0;
   for(int i=0;i<ch.length-1;i++){
    if(ch[i]!=ch[i+1]){
      sb.append(ch[i]);
      sb.append(String.valueOf(count+1));
      count=0;
    }
    else{
      count++;
    }
   }  
    return sb.toString(); 
        
    }
     
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      System.out.print(encryptString(str));
      
    }
}
