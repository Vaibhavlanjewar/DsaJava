/*Problem Statement – Given a string S(input consisting) of ‘*’ and ‘#’. The length of the string is variable. The task is to find the minimum number of ‘*’ or ‘#’ to make it a valid string. The string is considered valid if the number of ‘*’ and ‘#’ are equal. The ‘*’ and ‘#’ can be at any position in the string.
Note : The output will be a positive or negative integer based on number of ‘*’ and ‘#’ in the input string.

(*>#): positive integer
(#>*): negative integer
(#=*): 0
Example 1:
Input 1:

###***   -> Value of S
Output :

0   → number of * and # are equal */
import java.util.*;
public class q2 {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    
    // input string 
    String str=sc.nextLine();
    int cnt_star=0;
    int cnt_hash=0;

    for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='*'){
            cnt_star++;
        }
        else if(str.charAt(i)=='#'){
            cnt_hash++;
        }
    }
    int ans=cnt_star-cnt_hash;
    System.out.println(ans);
}
}
