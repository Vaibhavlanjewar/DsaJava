import java.util.ArrayList;

public class q61SubsetOfString {

    public static void subset(String str,String ans,int i){
        if(i==str.length()){
            System.out.println(ans);
            return ;
        }
        // choice yes
        subset(str,ans+str.charAt(i),i+1);

        // choise is no
        subset(str,ans,i+1);


    }
    public static void SubsetList(String str,ArrayList<String> ans,String up,int i){
        if(i==str.length()){
            ans.add(up);
            return ;
        }
        // choice yes
        subset(str,up+str.charAt(i),i+1);

        // choise is no
        subset(str,up,i+1);


    }
    public static void main(String args[]){
        String str="abc";
        // subset(str, "", 0);
        ArrayList<String>ans=new ArrayList<>();
        SubsetList(str,ans,"",0);
        System.out.println(ans);
    }
}
