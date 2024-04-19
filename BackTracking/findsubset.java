package BackTracking;

public class findsubset {
    public static void findsubsets(String str,String ans,int i){
        // base case 
        if(i==str.length()){
            if(ans.isEmpty()){
            System.out.println("null");
                 }
            else{
                System.out.println(ans);
            }
            return ;
        }
        // if choice is yes 
        findsubsets(str,ans+str.charAt(i), i);
        // No choice 
        findsubsets(str, ans, i);
}
public static void main(String args[]){
        String str="abc";
        findsubsets(str,"",0);
}
}
