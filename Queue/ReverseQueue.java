import java.util.*;
public class ReverseQueue {
// 5 * 
    public static void reverseQ(Queue<Integer>q){
        Stack<Integer>st=new Stack<>();

        while(!q.isEmpty()){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.peek());
            st.pop();
        }
    }
    public static void main(String args[]){
        Queue<Integer>q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5); 

        // reverse queue 
        reverseQ(q);

        // print rev Q
        while(!q.isEmpty()){
            System.out.print(q.remove()+ " ");
        }
    }
}
