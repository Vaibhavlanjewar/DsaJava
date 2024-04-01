import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Stack;

public class Queue_using_2Stacks {
    // push O(n)
    /*
    Add              - O(n)
    
    remove and peek  - O(1)
     //24-03-2024 ,vnbl 
     */

     /*
     Algorithm  
     take 2 stacks say s1 and s2 
     
     a] if s1 isEmpty --> push element
     b] is s1 is Not empty --> 
          1} transfer elements of s1 to s2 
          2} in s1 push new element 
          3} transfer elements of s2 to s1 
     
     */

     static class Queue{
        static Stack<Integer>s1=new Stack<>();
        static Stack<Integer>s2=new Stack<>();
        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        // add 
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        // remove 
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.pop();
        }
        // peek 
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.peek();
         }
    }

    @SuppressWarnings("static-access")
    public static void main(String args[]){

        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
        
}
