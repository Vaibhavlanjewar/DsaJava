
/* Q21. A furnishing company is manufacturing a new collection of curtains. The curtains are of
 two colors aqua(a) and black (b). The curtains color is represented as a string(str) consisting
 of a’s and b’s of length N. Then, they are packed (substring) into L number of curtains in each
 box. The box with the maximum number of‘aqua’ (a) color curtains is labeled. The task here
 is to find the number of ‘aqua’ color curtains in the labeled box.
 Note:
 If ‘L’ is not a multiple of N, the remaining number of curtains should be considered as a
 substring too. In simple words, after dividing the curtains in sets of ‘L’, any curtains left will
 be another set(refer example 1)
 Example1:
 Input :
bbbaaababa-> Value of str
 3  ->ValueofL
 Output:
 3 ->Maximumnumberofa’s
 Explanation:
 From the input given above.
 Dividing the string into sets of 3 characters each 
Set 1: {b,b,b}
 Set 2: {a,a,a}
 Set 3: {b,a,b}
 Set 4: {a}-> leftover characters also as taken as another set
 Amongall the sets, Set 2 has more number of a’s. The number of a’s in set 2 is 3.
 Hence, the output is 3

*/

import java.util.*;
public class day2q21{

public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  String str=sc.nextLine();

  int l=sc.nextInt();
  
  int maxAquaCount = 0;
  int n=str.length();
 
  
  for(int i=0;i<n;i++){
      int acnt=0;
     for(int j=i;j<i+l && j<n ;j++){
     if(str.charAt(j)=='a') acnt++;
     }
     maxAquaCount = Math.max(maxAquaCount, acnt);
   
   }
   System.out.print(maxAquaCount);
 }

}
