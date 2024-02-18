package hashmap;
import java.util.*;

public class linked_hm {
    public static void main(String args[]){
     LinkedHashMap<String,Integer>lhm=new LinkedHashMap<>();

     lhm.put("India",120);
     lhm.put("China",140);
     lhm.put("Pak",45);
     lhm.put("Austreliya",10);
     lhm.put("Us",23);
     System.out.println(lhm);

     HashMap<String,Integer>hm=new HashMap<>();

     hm.put("India",120);
     hm.put("China",140);
     hm.put("Pak",45);
     hm.put("Austreliya",10);
     hm.put("Us",23);
     System.out.println(hm);

     // TreeMap 
     TreeMap<String,Integer>thm=new TreeMap<>();


     thm.put("Bhutan",120);
     thm.put("India",120);
     thm.put("China",140);
     thm.put("Pak",45);
     thm.put("Austreliya",10);
     thm.put("Us",23);
     System.out.println(thm);

    }
}
