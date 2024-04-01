import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Q_using_collection_framework {
    public static void main(String args[]){
       // Queue is an Interface of linkedlist/ ArrayDequeue
       System.out.println("Using linked list as interface");
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

        System.out.println("Using Array Dequeue");
        // ArrayDeque
        Queue<Integer> q1 = new ArrayDeque<>();
        q1.add(5);
        q1.add(4);
        q1.add(3);
        while (!q1.isEmpty()) {
            System.out.println(q1.peek());
            q1.remove();
        }
    }
}
