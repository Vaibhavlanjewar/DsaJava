import java.util.*;
public class twoDList {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>>mlist=new ArrayList<>();
        ArrayList<Integer>l1=new ArrayList<>();
        ArrayList<Integer>l2=new ArrayList<>();
        ArrayList<Integer>l3=new ArrayList<>();

        for(int i=1;i<5;i++){
            l1.add(i*1);
            l2.add(i*2);
            l3.add(i*3);
        }
        mlist.add(l1);
        mlist.add(l2);
        mlist.add(l3);
        System.out.println(mlist);
        
        
        
        

    }
}
