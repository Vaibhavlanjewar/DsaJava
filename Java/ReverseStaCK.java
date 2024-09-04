import java.util.Stack;

public class ReverseStaCK{
    public static void revStack(Stack<Integer>st){
        if(st.isEmpty()){
         
           return ;
        }
        int x=st.pop();
        // System.out.println(x);
       
        revStack(st);
        st.push(x);
        
        
    } 
public static void main(String[] args) {
    Stack<Integer>st=new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    System.out.println(st);
    revStack(st);
    while(!st.isEmpty()){
        System.out.println(st.pop());
    }
}
}