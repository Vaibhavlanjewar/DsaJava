import java.util.Stack;

public class revStringUsingStack {
    public static void  main(String args[]){
        String str="abc";
        
        String result=reverse(str);
        System.out.println(result);
    }

    public static String  reverse(String str){
        Stack<Character>st=new Stack<>();
        int idx=0;
        while(idx<str.length()){
            st.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result=new StringBuilder("");
        while(!st.isEmpty()){
            char curr=st.pop();
            result.append(curr);
            
        }
        str=result.toString();
        return str;
        
    }
}
