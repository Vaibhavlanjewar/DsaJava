import java.util.Stack;
//https://leetcode.com/problems/reverse-words-in-a-string/submissions/1223260658/
public class LT151_rev_word_b4space {
    public static void main(String args[]) {
        String S1 = "the sky is blue";
        String S2 = "  hello world  ";
        
        System.out.println(reverseWords(S1));
        System.out.println(reverseWords(S2));
    }

    public static String reverseWords(String S) {
        // Split the input string by spaces to extract individual words
        String[] words = S.trim().split("\\s+");
        Stack<String> st = new Stack<>();
        
        // Push words onto the stack in reverse order
        for (String word : words) {
            st.push(word);
        }

        // Construct the reversed string with words separated by a single space
        StringBuilder reversedString = new StringBuilder();
        while (!st.isEmpty()) {
            reversedString.append(st.pop()).append(" ");
        }

        // Remove the trailing space and return the reversed string
        return reversedString.toString().trim();
    }
}
