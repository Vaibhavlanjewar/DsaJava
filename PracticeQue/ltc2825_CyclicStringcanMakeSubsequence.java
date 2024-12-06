// package PracticeQue;

// public class ltc2825_CyclicStringcanMakeSubsequence {
//     public static boolean cycle(char a, char b) {
//         // Ensure the input characters are within the 'a' to 'z' range
//         if (a < 'a' || a > 'z' || b < 'a' || b > 'z') {
//             return false;  // or throw an IllegalArgumentException
//         }
    
       
//         char res = (char) ('a' + (a - 'a' + 1) % 26);
        
       
//         return res == b;
//     }
    
//         public static boolean canMakeSubsequence(String str1, String str2) {
//             int sp=0,tp=0;        
//             while(sp<str1.length() && tp<str2.length()){
//               char a=str1.charAt(sp);
//               char b=str2.charAt(tp);
//                  if((a==b) || cycle(a,b)) {
//                     tp++;
//                 }
                 
//                     sp++;
                
                 
//             }
//             return tp==str2.length();
//         }
//         public static void main(String args[]){
//             // Input: str1 = "abc", str2 = "ad"
//             System.out.println(canMakeSubsequence("abc","ab")); //true 
//             /*Input: str1 = "ab", str2 = "d"
//             Output: false */
//             System.out.println(canMakeSubsequence("ab","d")); //false 
//             //3/12/2025 
//         } 
// }
