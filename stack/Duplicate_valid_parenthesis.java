import java.util.Stack;

public class Duplicate_valid_parenthesis {
    public static void main(String[] args){
        String str = "((a+b))";
        String str2="(a-b)";
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));
    }

    public static boolean isDuplicate(String str){
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ')'){ // Correctly handling the closing parenthesis
                int cnt = 0;
                while(!st.isEmpty() && st.peek() != '('){
                    st.pop();
                    cnt++;
                }
                if(st.isEmpty()) {
                    // Stack is empty before finding '(', invalid parentheses string
                    return false; // Or throw an error
                }
                st.pop(); // Pop the '('
                if(cnt <= 1) { // If cnt is 0 or 1, it's a duplicate or unnecessary parentheses
                    return true;
                }
            }
            else{
                st.push(ch); // Push everything else onto the stack
            }
        }
        return false;
    }
}
