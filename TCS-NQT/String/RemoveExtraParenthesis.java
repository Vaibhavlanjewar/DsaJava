

/* 
// remove extra parenthesis 
 Input string : (()())(())
 output String :()()()
*/ 

import java.util.*;

 public class RemoveExtraParenthesis{

  public static String removeParenthesis(String str){

    int cnt=0;
    StringBuilder sb=new StringBuilder();
    for(char c:str.toCharArray()){
     if(c=='('){
       if(cnt>0)sb.append(c);
       cnt++;
     }
      else if(c==')'){
       cnt--;
       if(cnt>0)sb.append(c);
      }
    }
    return sb.toString();
  }
 
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);

   String str=sc.nextLine();
   System.out.print(removeParenthesis(str));
 
  }
 } 