// securityBoard Codding Question 

import java.util.*;
public class secBoard1{

  public static int longestStringWithoutRepeatingCharacter(String str){

    int ch[]=new int[26];
    for(char c:str.toCharArray()){
       ch[c-'a']++;
    }
    int length=0;
    for(int i=0;i<26;i++){
         if(ch[i]!=0){
            length++;
          }
         else{
            continue;
           }
     }
     return length;
    
  }


  public static double clockAngle(int hr,int min){

   return Math.abs(5.5*min-30*hr);
    
  }

   public static char firstNonRepeatingChar(String str){
     HashMap<Character,Integer>mp=new HashMap<>();
     for(char ch:str.toCharArray()){
         mp.put(ch,mp.getOrDefault(ch,0)+1);
    }
     char c='a';
     for(char ch:str.toCharArray()){
         if(mp.get(ch)==1){
            c=ch;
            break;
          }
     }
     return c;
  }

  public static void main(String args[]){
  String str="abcabc";
  
// Longest substring without repeating character 
  System.out.println(longestStringWithoutRepeatingCharacter(str));

//clock angle 
 int hr=6,min=0;
 System.out.println(clockAngle(hr,min));

// first non repeating char in string 
    String str1="abcdabc";
   System.out.println(firstNonRepeatingChar(str1));

  }

}