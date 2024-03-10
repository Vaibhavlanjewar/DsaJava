package hashmap;
import java.util.*;
public class String_game {
    public static int minv(String s, int k ){
        int res=0;
        HashMap<Character,Integer>str=new HashMap<>();
        for(Character c:s.toCharArray()){
            str.put(c,str.getOrDefault(c,0)+1);
        }

        
      return res;
    }
    public static void main(String args[]){
        String s="abccc";
        int k=1;
        // HashMap<Character,Integer> map = new HashMap<>();  // Create a Hash Map to
        System.out.println("Original string : "+s);
        int res=minv(s,k);
        System.out.println("res: "+res);
    }
    
}
