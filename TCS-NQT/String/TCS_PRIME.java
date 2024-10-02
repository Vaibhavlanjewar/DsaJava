/*Problem Statement – An automobile company manufactures both a two wheeler (TW) and a four 
wheeler (FW). A company manager wants to make the production of both types of vehicle according 
to the given data below: 
 
1st data, Total number of vehicle (two-wheeler + four-wheeler)=v 
2nd data, Total number of wheels = W 
The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the 
given data. 
Example : 
 
Input : 
200  -> Value of V 
540   -> Value of W 
 
Output : 
TW =130 FW=70 
 
Explanation: 
130+70 = 200 vehicles 
(70*4)+(130*2)= 540 wheels 
 
Constraints : 
 
2<=W 
W%2=0 
V<W 
Print “INVALID INPUT” , if inputs did not meet the constraints.  */
 
  import java.util.*;
  public class TCS_PRIME{
 
  public static void main(String args[])
  {

    Scanner sc=new Scanner(System.in);
    int V=sc.nextInt();
    int W=sc.nextInt();

    if(W>=2 && W%2==0 && W>V) 
    {
        int t2=(4*V-W)/2;
        int t4=V-t2;
        System.out.print("TW="+t2+" "+"FW="+t4);
    }
    else
    {
    System.out.println("INVALID INPUT");
    }
  
  }


 }