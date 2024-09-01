/*
Count Alphabets


https://www.geeksforgeeks.org/problems/count-alphabets3649/1

Given a string, The task is to count the number of alphabets present in the string.

Example 1:

Input:
S = "adjfjh23"
Output: 6
Explanation: only last 2 are not 
alphabets.
Example 2:

Input:
S = "n0ji#k$"
Output: 4
Explanation: #, $, 0 are not alphabets.

Your Task:  
You don't need to read input or print anything. Your task is to complete the function Count() which takes the string S as inputs and returns alphabets count.

Expected Time Complexity: O(|S|)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ |S| ≤ 105
S contains only upper and lower case alphabets, digits and '#', '!', '$', '&' only.
*/


import java.util.*;  
public class q38_countAlphabets {
   public static  int countletter(String S)
    {
        // code here
        int cnt=0;
        for(char i:S.toCharArray()){
            if((i>='a' &&i<='z') || i>='A' && i<='Z'){
                cnt++;
            }
        }
        return cnt;
    }
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    System.out.print(countletter(str));
   }
 
}
