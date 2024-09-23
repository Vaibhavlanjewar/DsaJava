import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

public class J52Collections {
    public static void main(String args[]) {
        // ---------ArrayList---------------
        // List<Integer> nums=new ArrayList<>();

        // nums.add(6);
        // nums.add(7);
        // nums.add(8);
        // nums.add(88);

        // System.out.println(nums.get(2));

        // for(int i:nums){
        // System.out.println(i);
        // }

        // ---------- SET Unique value store karne k liye -------------

        // HashSet<Integer> set = new HashSet<>(); // keep unique elements
        // LinkedHashSet<Integer> set = new LinkedHashSet<>(); // keep unique and orderd
        // fashion to the elements
        // TreeSet<Integer>set=new TreeSet<>(); // keep unique an dsorted order
        // set.add(6);
        // set.add(7);
        // set.add(8);
        // set.add(88);

        // Iterator it = set.iterator();
        // System.out.println(it.hasNext()); // true
        // System.out.println(it.next());// 6

        // while (it.hasNext()) {
        // System.out.println(it.next());
        // }

        /*
         * true
         * 6
         * 7
         * 8
         * 88
         */

        // ======= MAP ,is interface class is HashMap =====
        // HashMap<String, Integer> Student = new HashMap<>();
        TreeMap<String,Integer>Student=new TreeMap<>();
        // LinkedHashMap<String,Integer>Student=new LinkedHashMap<>();
        Student.put("Vaibhav", 97);
        Student.put("Harsh", 95);
        Student.put("Vaishanvi", 97);
        Student.put("Purva", 95);

        System.out.println(Student.keySet());
        for (String key : Student.keySet()) {
            System.out.println(key + " : " + Student.get(key));
        }
    }
}
