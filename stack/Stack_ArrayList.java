import java.util.ArrayList;

public class Stack_ArrayList {

    static class Stack {
        static ArrayList<Integer> st = new ArrayList<>();

        // Check if stack is empty
        public static boolean isEmpty() {
            return st.isEmpty();
        }

        // Push operation
        public static void push(int data) {
            st.add(data);
        }

        // Pop operation
        public static int pop() {
            if (isEmpty()) {
                return -1; // Or throw an exception
            } else {
                int top = st.get(st.size() - 1);
                st.remove(st.size() - 1);
                return top;
            }
        }

        // Peek operation
        public static int peek() {
            if (isEmpty()) {
                return -1; // Or throw an exception
            } else {
                return st.get(st.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        // Since methods are static, no need to instantiate Stack
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        Stack.push(4);
        System.out.println(Stack.pop()); // This should now correctly pop the top element
    }
}
