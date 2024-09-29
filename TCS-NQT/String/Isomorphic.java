// isomorphic String 


import java.util.*;
 public class Isomorphic{

  public static boolean isIsoMorphic(String str1,String str2){
    if(str1.length()!=str2.length()) return false;
    HashMap<Character,Character>mp=new HashMap<>();
    for(int i=0;i<str1.length();i++){
     char a=str1.charAt(i);
     char b=str2.charAt(i);
     if(mp.containsKey(a)){
        if(!mp.get(a).equals(b)) return false;
     }
     else {
      if(mp.containsValue(b)){
        return false;
        } 
      mp.put(a,b);
      }
    }
   return true;
  }

  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   String str1=sc.nextLine();
   String str2=sc.nextLine();
   System.out.print(isIsoMorphic(str1,str2));
  }
 }