import java.util.Stack;

public class ReverseStack {
    public static void main(String args[]){
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("original stack");
       // printStack(s);
        reverseStack(s);
        System.out.println("After reversing stack");
        printStack(s);
        // print 
       
        
    }
    //print stack 
    public static void printStack(Stack<Integer>s){
        while(!s.isEmpty()){
            System.out.println( s.pop());
           
        }
    }
    public static void pushAtbottom(Stack<Integer>s,int data){
        if(s.isEmpty()){
            s.push(data);
            return ;
        }
        int top=s.pop();
        pushAtbottom(s, data);
        s.push(top);
    }

    // reverse stack fun 
    public static void reverseStack(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverseStack(s);
        pushAtbottom(s, top);

    }

}
