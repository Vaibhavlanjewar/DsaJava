import java.util.*;
public class revList {
 public static void main(String args[]){
    ArrayList<Integer>l=new ArrayList<>();
    l.add(1);
    l.add(2);
    l.add(3); 
    l.add(4);
    l.add(5);
    for(int i=l.size()-1;i>0;i--){
        System.out.println(l.get(i)+" ");
    }
 

 }   
}
