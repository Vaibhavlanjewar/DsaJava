/*
Reverse Words in String 
inp: " the sky is blue"
op : "blue is sky the"

 */ 
import java.util.*;
public class ReverseWords{

  public static String reverse(String str){
    StringBuilder sb=new StringBuilder();
    str=str.trim();
    String[] s=str.split(" ");
    int i=0,e=s.length-1;
    while(i<e){
      String temp=s[i];
      s[i]=s[e];
      s[e]=temp;
      i++;
      e--;
    }
  
   int n=s.length;
   for(int j=0;j<s.length;j++){
    sb.append(s[j]);
    if(j<n-1){
      sb.append(" ");
     }
   }
  
  return sb.toString();
  }

 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  String str=sc.nextLine();

  System.out.println(reverse(str));
 }

}