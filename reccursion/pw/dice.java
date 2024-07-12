import java.util.ArrayList;

public class dice {
    public static void main(String[] args) {
        DiceCombination("",4);
        ArrayList<String>ans=DiceCombinationList("",4);
        System.out.println(ans);
    }

    static void DiceCombination(String p,int target){
        if(target==0){
            System.out.println(p);
            return ;
        }
        for(int i=1;i<=6 && i<=target;i++){
            DiceCombination(p+i,target-i);
        }
    }

    static ArrayList<String> DiceCombinationList(String p,int target){
        if(target==0){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list ;
        }
        ArrayList<String>ans=new ArrayList<>();
        for(int i=1;i<=6 && i<=target;i++){
           ans.addAll( DiceCombinationList(p+i,target-i));
        }
        return ans;
    }
}
