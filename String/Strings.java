import java.util.*;

public class Strings{
    @SuppressWarnings("unused")
    public static void main(String args[]){
        // Sting declaration 
        // char arr[]={'a' , 'b','c', 'd'};
        // String str1 = new String("abce");
        // String str2="abcdf";
        // System.out.println(str1);
        // System.out.println(str2);
        // for (char c :arr ) {
        //     System.out.print(c+" ");
        // }

        // // input
        // Scanner sc=new Scanner(System.in);
        // System.out.println("\nEnter String ");
       // next() only take input as word
        // String s1=sc.next();
       
        // System.out.println("String s1: "+ s1);
        // nextLine() take input as a line 
        // System.out.println("\nEnter String ");
        // String s2=sc.nextLine();
        // System.out.println(s2);

        // length function
    //   String v="Vaibhav Lanjewar";
    //   System.out.println("Length of string: "+ v.length());


    // concatination
    // String x ="Hello ";
    // String y="Vnbl";
    // String xy=x+ " " + y;
    // System.out.println(xy);

    // Substring 
    String v= "Vaibhavlanjewar";
    System.out.println(v.substring(0,7));
    System.out.println(subString(v,7,12));
    }
    public static String subString(String v, int si, int ei){
             String substr="";
             for(int i=si;i<ei;i++){
                substr+=v.charAt(i);
             }
             return substr;
    }
}