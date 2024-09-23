import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class J55StreamsAndFilter {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 6, 7, 8, 9);

        // Stream<Integer>s1=nums.stream();
        // Stream<Integer>s2=s1.filter(n->n%2==0);
        // Stream<Integer>s3=s2.map(n->n*2);
        // int res=s3.reduce(0,(c,e)->c+e);
        // s1.forEach(n->System.out.println(n));
        // s2.forEach(n->System.out.println(n));
        // System.out.println(res);

        // shortan
        // int result = nums.stream()
        //         .filter(n -> n % 2 == 0)
        //         .map(n -> n * 2)
        //         .reduce(0, (c, e) -> c + e);
        // System.out.println(result);

        // parallel stream
        int size=10000;
        List<Integer>num=new ArrayList<>(size);
        Random ran=new Random();
        for(int i=1;i<=size;i++){
            num.add(ran.nextInt(100));
        }
        int sum1=num.stream()
                 .map(i->i*2)
                 .reduce(0,(c,e)->c+e);

      System.out.println(sum1);

    
    }

}
