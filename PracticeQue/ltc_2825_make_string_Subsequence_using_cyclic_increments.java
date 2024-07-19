public class ltc_2825_make_string_Subsequence_using_cyclic_increments {
    // // https://leetcode.com/problems/make-string-a-subsequence-using-cyclic-increments/
 
    public static boolean cycle(char a, char b) {
        // Ensure the input characters are within the 'a' to 'z' range
        if (a < 'a' || a > 'z' || b < 'a' || b > 'z') {
            return false;  // or throw an IllegalArgumentException
        }
    
        // Calculate the result of incrementing 'a' with wrap-around
        char res = (char) ('a' + (a - 'a' + 1) % 26);
        
        // Check if the result is equal to 'b'
        return res == b;
    }
    
        public static boolean canMakeSubsequence(String str1, String str2) {
            int sp=0,tp=0;        
            while(sp<str1.length() && tp<str2.length()){
              char a=str1.charAt(sp);
              char b=str2.charAt(tp);
                 if((a==b) || cycle(a,b)) {
                    tp++;
                }
                 sp++; 
            }
            return tp==str2.length();
        } 
        public static void main(String[] args) {
           
            
            System.out.println(canMakeSubsequence("abcz", "bcda")); // Output: true
            System.out.println(canMakeSubsequence("abc", "acd"));   // Output: false
            System.out.println(canMakeSubsequence("abcz", "abcd")); // Output: true
            System.out.println(canMakeSubsequence("om", "nm"));     // Output: true
            System.out.println(canMakeSubsequence("abc", "ad"));    // Output: false
        }  
}


    

