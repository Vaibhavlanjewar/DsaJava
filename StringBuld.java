import java.util.*;
public class StringBuld {
    public static void main (String args []){
//        System.out.println("StringBuilder in java");
//
//        System.out.println("Strings are immutable\n");
//
//        StringBuilder sb=new StringBuilder("Tonny");
//        System.out.println(sb);
//        System.out.println("CharAt 0 : "+sb.charAt(0));
//
//        // set char at given index 0
//        sb.setCharAt(0,'p');
//        System.out.println(sb);
//
//        // insert if we have pony and have to make vpony
//
//        sb.insert(0,'V');
//        System.out.println(sb);
//        // we have Vponny and we have make it as Vpoony
//        sb.insert(2,'o');
//        System.out.println(sb); //Vpoony
//
//        // delete the part by using .delete(start,end_ind_non_inclusive)
//
//        // delete last index i.e y  from Vpoonny
//        sb.delete(6,7);
//        System.out.println(sb); // Vpoonn

        // append  at last index
        StringBuilder s1=new StringBuilder("h");
        s1.append('e');
        s1.append("llo");
        System.out.println(s1);

        System.out.println("length"+ s1.length());

        // # reverse string  "hello" --olleh
        // { h , e , l , l , o}
        //   1   2   3   4   5
        // { o ,l ,l,e,h} rev
        System.out.println(s1+" reversed to  ");
         for(int i=0;i<s1.length()/2;i++){
             int front=i;
             int back= s1.length()-1-i;

             char frontchar=s1.charAt(front);
             char backchar=s1.charAt(back);
             s1.setCharAt(front,backchar);
             s1.setCharAt(back,frontchar);

         }
        System.out.println(s1);



    }
}
