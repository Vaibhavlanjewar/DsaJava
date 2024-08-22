import java.util.HashSet;
// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
public class ltc_162_check_twoString_array_same {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        for(String s:word1){
         s1.append(s);
        }
        System.out.println(s1.toString());
        for(String i:word2){
         s2.append(i);
        }
        System.out.println(s2);
        
        return s1.toString().equals(s2.toString());
 }
 public static void main(String args[]){
         String word[]={"ab", "c"};
         String word2[]={"a", "bc"};
         System.out.println(arrayStringsAreEqual(word,word2));
 }
}
