import java.util.ArrayList;

// import java.util.Collections;

public class MaxEl {
    public static void main(String args[]){
        ArrayList<Integer>l=new ArrayList<>();
        l.add(5);
        l.add(9);
        l.add(3); 
        l.add(4);
        l.add(5);
       // Integer max=Collections.max(l);
       int max=Integer.MIN_VALUE;
       for(int i=0;i<l.size();i++){
        //  if(max<l.get(i)){
        //     max=l.get(i);
        //  }
        max=Math.max(max,l.get(i));
       }
        System.out.println(max);
}
}
