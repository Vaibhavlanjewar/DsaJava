import java.util.Stack;

public class PushAt_BottomofStack{
    public static void main(String args[]){
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtbottom(s, 4);
        // print 
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
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

}