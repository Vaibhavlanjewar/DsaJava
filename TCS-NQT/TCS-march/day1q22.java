 /*Q22.An international round table conference will be held in india. Presidents from all over
 the world representing their respective countries will be attending the conference. The task
 is to find the possible number of ways(P) to make the N members sit around the circular
 table such that.
 The president and prime minister of India will always sit next to each other.
 Example1:
 Input :
 4 ->ValueofN(No.ofmembers)
 Output : 
12 -> Possible ways of seating the members
 Explanation:
 2 members should always be next to each other. 
So, 2 memberscanbein2!ways
 Rest of the members canbearranged in (4-1)! ways.(1 is subtracted because the previously
 selected two members will be considered as single members now).
Sototal possible ways 4 members can be seated around the circular table 2*6= 12.
 Hence, output is 12.
 Example2:
 Input:
 10 -> Value of N(No. of members)
 Output :
 725760-> Possible ways of seating the members 
Explanation:
 2 membersshouldalways be next to each other.
 So, 2 memberscanbein2!ways 
Rest of the members canbearranged in (10-1)! Ways. (1 is subtracted because the previously
 selected two members will be considered as a single member now).
 So, total possible ways 10 members can be seated around a round table is 
2*362880 =725760ways.
 Hence, output is 725760 */

import java.util.*;
public class day1q22{
 public static int factorial(int n){
  if(n==0 || n==1) return 1;
  return n*factorial(n-1);

 }
   
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int member=sc.nextInt();
    int fact=factorial(member-1);
    System.out.print(2*fact);
   }

}