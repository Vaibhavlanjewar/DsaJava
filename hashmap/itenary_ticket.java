package hashmap;
import java.util.*;
public class itenary_ticket {

    public static String getStart(HashMap<String,String>tkt){
        HashMap<String,String>revMap=new HashMap<>();
        for( String key: tkt.keySet()){
            revMap.put(tkt.get(key),key);

        }
        for( String key:tkt.keySet() ){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
      return null;
    }
public static void main(String args[]){
    HashMap<String,String>tkt=new HashMap<>();
    
    tkt.put("Chennai","Bengaluru");
    tkt.put("Mumbai","Delhi");
    tkt.put("Goa","Chennai");
    tkt.put("Delhi","Goa");
    
    String s=getStart(tkt);
    System.out.print("The starting city is "+s);
    for(String key: tkt.keySet()){
        System.out.print("->"+tkt.get(s));
       s=tkt.get(s);
    }

}    
}
