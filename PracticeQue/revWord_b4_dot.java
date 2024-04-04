import java.util.Stack;

public class revWord_b4_dot {
    public static void main(String args[]) {
        String S = "i.like.this.program.very.much";

    }
//https://www.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1?page=2&difficulty=Basic,Easy&sortBy=submissions

    public static String reverseWords(String S)
    {
        Stack<String> st = new Stack<>();
        // StringBuilder word=new StringBuilder();
        StringBuilder v = new StringBuilder();
        int i=0;
        while (i < S.length()) {
            char ch=S.charAt(i);
            if ( ch != '.') {
                v.append(ch);
            }
            else{
                st.push(v.toString());
                st.push(".");
                v.setLength(0);
            }
            i++;
        }
        st.push(v.toString()); // last word 

        StringBuilder reversedString = new StringBuilder();
        while (!st.isEmpty()) {
            reversedString.append(st.pop());
        }

        return reversedString.toString();
    }
}