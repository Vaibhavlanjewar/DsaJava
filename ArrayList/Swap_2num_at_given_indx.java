import java.util.ArrayList;

public class Swap_2num_at_given_indx {
    public static void swap(ArrayList<Integer>list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);

    }
    public static void main(String[]args){
        ArrayList<Integer>l=new ArrayList<>();
        l.add(5);
        l.add(9);
        l.add(3); 
        l.add(4);
        l.add(5);
        System.out.println("Before swapping list\n "+l );
        swap(l,2,4);
        System.out.println("after swapping at index 2 ,4 \n"+l);
    }

}
