import java.util.*;

public class LongestCommonPrefix{

 public static String longestCommonprefix(String []str){
    Arrays.sort(str);

    String s1=str[0];
    String s2=str[1];
    StringBuilder sb=new StringBuilder();
    int sp=0,tp=0;
    while(sp<s1.length() && tp<s2.length()){
      char a=s1.charAt(sp);
      char b=s2.charAt(tp);
      if(a==b){
         sb.append(a);
        
       }
      else break;
     sp++;tp++;
      
    }
    return sb.toString();
  }

  public static void main(String args[]){
   String []str={"flower","flow","flight"};
   // op -fl

   System.out.print(longestCommonprefix(str));
  }
}