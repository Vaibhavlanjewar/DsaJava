import java.util.ArrayList;

public class Ltc_17letter_combination_of_pgone_number {
    public static void main(String args[]){
      pad("","12");

    //   arraylist
    ArrayList<String>ans=padList("", "12");
    System.out.println(ans);
    }
    static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0'; //this conver 2-- '2'
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            pad(p+ch,up.substring(1));
        }

    }

    static ArrayList<String> padList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>ans=new ArrayList<>();
        int digit=up.charAt(0)-'0'; //this conver '2'-- 2
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            ans.addAll(padList(p+ch,up.substring(1)));
        }
        return ans;
    }
}
