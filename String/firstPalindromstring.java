
import java.util.*;
public class firstpalindromstring{ // first palindrom string

    public static String firstPalindrome(String[] words) {
       // String res = "";
        for(int i=0;i<words.length;i++){
        StringBuilder sb=new StringBuilder(words[i]);
        if(sb==sb.reverse()){
            return sb.toString();
        }
        }
     return "";
    }
    public static void main (String args[]){
        String word[]={"aba","abc","agf"};
        String res=firstPalindrome(word);
        System.out.println(res);
    }
    
}
