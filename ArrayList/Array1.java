import java.util.*;

public class Array1 {
    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<>();
        // add operation
        arr.add(1); // O(1)
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println(arr);
        // get element , get element at given index O(1)
        int el = arr.get(3);
        System.out.println(el);

        // Delete o(1) element at given index 
        arr.remove(2);
        System.out.println(arr);

        // set element at index , new value  , )(1)
        arr.set(1,555);
        System.out.println(arr);

        // Contains , to check weather element exist or not
        System.out.println(arr.contains(1));
        System.out.println(arr.contains(45));

        // add at specific index // 0(n)

        arr.add(3,88);
        System.out.println(arr);

        // get element 
        System.out.println(arr.get(3));
        // size()
        System.out.println(arr.size());
        System.out.println("Array print by iterating ");
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
        System.out.println();



    }
}
