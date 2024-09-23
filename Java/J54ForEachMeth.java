import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class J54ForEachMeth {
    private static final String Consumer = null;

    public static void main(String[] args) {
        List<Integer>nums=Arrays.asList(4,5,6,7,8,9);
       
        // consumer interface is functional interface 
        Consumer<Integer>con=(Integer n)->System.out.println(n);
           
        nums.forEach(con);   
        }
       
    }

