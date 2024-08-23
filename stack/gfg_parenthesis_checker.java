import java.util.Stack;

public class gfg_parenthesis_checker {
    public static boolean ispar(String x)
    {
        // add your code here
        if(x.length()==1)return false;
        Stack<Character>st=new Stack<>();
        for(char c:x.toCharArray()){
            if(c=='{' || c=='(' || c=='['){
                st.push(c);
            }
           else if(!st.isEmpty()){
               if( (st.peek()=='{'  && c=='}' ) || (c==')' && st.peek()=='(') || (c==']' && st.peek()=='[')){
                  st.pop();
                 }
                 else{
                    return false;
                 }
              }
            else return false;  

        }
        if(st.isEmpty()) return true;
        else return false;
       
        
    }
    public static void main(String args[]){
        String x="{}{(}))}";
        System.out.println(ispar(x));
    }
}
