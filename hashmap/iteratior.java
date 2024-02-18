package hashmap;
import java.util.*;
public class iteratior {
    public static void main(String args[]){
      HashSet<String>citi=new HashSet<>();
      citi.add("Bhandara");
      citi.add("Nagpur");
      citi.add("Wardha");
      citi.add("Gondia");
      citi.add("Pune");
      citi.add("Amravati");

    //   Iterator it=citi. iterator();
    //   while(it.hasNext()){
    //     System.out.println(it.next());
    //   }
    // another way , for each loop
    System.out.println("for each loop for hashset\n");
    for(String ct: citi){
        System.out.println(ct);
    }

    LinkedHashSet<String>citi1=new LinkedHashSet<>();
      citi1.add("Bhandara");
      citi1.add("Nagpur");                                  
      citi1.add("Wardha");
      citi1.add("Gondia");
      citi1.add("Pune");
      citi1.add("Amravati");
      citi1.remove("Amravati");  
       System.out.println("LinkedHAshset : "+citi1);

      TreeSet<String>citi2=new TreeSet<>();
       citi2.add("Bhandara");
       citi2.add("Nagpur");                                  
       citi2.add("Wardha");
       citi2.add("Gondia");
       citi2.add("Pune");
       citi2.add("Amravati");
       citi2.add("amravati"); 
     //  citi2.remove("Amravati");  
        System.out.println("Treeset : "+citi2);
    
 

    }

  
}
