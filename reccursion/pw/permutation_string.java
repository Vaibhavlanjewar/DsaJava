import java.util.ArrayList;

public class permutation_string {
    public static void main(String[] args) {
        // permutations("","abc");
        ArrayList<String>ans=permutationsList("","abc");
        System.out.println(ans);
    }
   static void permutations(String ans,String str){ 
    if(str.isEmpty()){
        System.out.println(ans);
        return;
    }
    char ch=str.charAt(0);
    for(int i=0;i<=ans.length();i++){
        String f=ans.substring(0,i);
        String s=ans.substring(i,ans.length());
        permutations(f+ch+s, str.substring(1));

    }
   } 
//    ArrayList 
static ArrayList<String> permutationsList(String ans,String str){
    if(str.isEmpty()){
        ArrayList<String>list=new ArrayList<>();
        list.add(ans);
        return list;
    }
    ArrayList<String>res=new ArrayList<>();
    char ch=str.charAt(0);
    for(int i=0;i<=ans.length();i++){
        String f=ans.substring(0,i);
        String s=ans.substring(i,ans.length());
        res.addAll(permutationsList(f+ch+s, str.substring(1)));
    }
    return res;
   } 
}
