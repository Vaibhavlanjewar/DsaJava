/*  Q2. An event management company has come up with a unique idea of printing their event tickets. Based 
on the ticket number combination (str1), the visitor is directed towards a particular class of audience. The 
task is to create a program/application to fetch the ticket number based on the following conditions: 
Any occurrences of digits EF, 56 and G, & should be deleted 
The characters EF should be in the same format. 
Example 1: 
Input: 
4523EF58G -> Value of STR1 
Output: 
452358  -> After removal of characters 
‘EF’ and ‘G’ 
Example 2: 
Input: 
E12F35G58 -> Value of STR1 
Output: 
E12F3558 -> After removal of character ‘G’ 
Explanation: 
In the above example, characters E and F are not together. So, they won’t be deleted. The output will be with 
only character G removal. 
The Input format for testing 
The candidate has to write the code to accept 1 input(s). 
First input - Accept value for str1 which is a string consisting of numbers and uppercase alphabets without 
any 
The output format for testing 
The output should be a string without any spaces (Check the output in Example 1 and Example 2) 
Additional messages in output will cause the failure of test cases. 
Constraints: 
Str={(A,Z),(0-9)} 
No spaces and special characters allowed. 
Only uppercase alphabets in the input string*/

import java.util.*;

public class q14 {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    StringBuilder sb = new StringBuilder();
    char[] ch = str.toCharArray();
    int n = ch.length;
    for (int i = 0; i < ch.length; i++) {
      int j = i + 1;
      if (ch[i] == 'x')
        continue;
      if (ch[i] == 'E' && ch[i + 1] == 'F' && j < n) {
        ch[i] = 'x';
        ch[j] = 'x';
      }
      if (ch[i] == '5' && ch[i + 1] == '6' && j < n) {
        ch[i] = 'x';
        ch[j] = 'x';
      }
      if (ch[i] == 'G') {
        ch[i] = 'x';
      }

    }

    for (char i : ch) {

      if (i == 'x')
        continue;
      else {
        sb.append(i);
      }
    }
    System.out.println(sb.toString());

  }
}
