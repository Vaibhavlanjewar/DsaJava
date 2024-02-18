package hashmap;
import java.util.*;
public class hashm {
    public static void main(String args[]){
       // map is lik interface
//        HashMap<String,Integer> empid=new HashMap<>();
//        empid.put("john",1);
//        empid.put("tom",2);
//        empid.put("vnbl",3);
//        System.out.println(empid);
//
//        System.out.println(empid.get("vnbl"));
//        System.out.println(empid.containsKey("vnbl"));
//        System.out.println(empid.containsValue(1));
//        empid.put("john",123);
//        System.out.println(empid);
//        empid.replace("tom",78);
//        System.out.println(empid);
//
//        empid.putIfAbsent("vnbl",7896);
//        empid.putIfAbsent("abhi",26);
//        System.out.println(empid);

        // alpha
        HashMap<String,Integer>hm=new HashMap<>();

        // insert
        hm.put("India",100);
        hm.put("China",150);
        hm.put("us",5);
        System.out.println(hm);

        //get operation
        int population=hm.get("China");
        System.out.println(population);

        // containskey(key) return true /false
        System.out.println(hm.containsKey("India")); //true
        System.out.println(hm.containsKey("pak")); //false

        // remove(key) , if key exist return val othervise return null
        System.out.println(hm.remove("China"));
        System.out.println(hm.remove("pak"));
        System.out.println(hm);
        hm.put("pak",5);
        hm.put("shrilanka",1);
        hm.put("dubai",4);
        hm.put("maldivs",1);
        System.out.println(hm);

        Set<String> keys =hm.keySet();
        System.out.println(keys);

        for(String k:keys){
            System.out.println("key= "+ k+ ", value= " +hm.get(k));
        }


    }
}
