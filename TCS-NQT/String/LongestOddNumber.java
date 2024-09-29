

import java.util.*;
public class LongestOddNumber{

  public static String oddNum(String num){
   StringBuilder sb=new StringBuilder();
   int a=num.length()-1;
   for(int i=a;i>=0;i--){
    
     char ch=num.charAt(i);
     int n=ch-'0';
     if(n%2==1){
       sb.append(num.substring(0,i+1)) ;
       break ;
     }
   
   }
   return sb.toString();
  }

  public static void main(String args[]){

   Scanner sc=new Scanner(System.in);
   String num=sc.nextLine();
 
   System.out.print(oddNum(num));
   }
}