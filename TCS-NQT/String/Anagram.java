 import java.util.*;
 public class Anagram{

  public static boolean isAnaGram(String s1,String s2){
   int n1=s1.length();
   int n2=s2.length();
   if(n1!=n2)return false;
   
   int freq[]=new int[26];
   for(int i=0;i<n1;i++){
      freq[s1.charAt(i)-'a']++;
    }
   for(int i=0;i<n2;i++){
    freq[s2.charAt(i)-'a']--;
   }
  
    for(int i:freq){
        if(i!=0)return false;
    }
    return true;
  }
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   String s1=sc.nextLine();
   String s2=sc.nextLine();

   System.out.print(isAnaGram(s1,s2));
  }
 }