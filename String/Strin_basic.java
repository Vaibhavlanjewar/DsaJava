import java.util.*;

public class Strin_basic{
    
    public static void main(String args[]){
       String v="Vnbl";
     //  System.out.println("The original string is : "+v);
       String v1="Vnbl";
       String v3=v1;
       System.out.println(v==v1);  // object is single and ref var are 2 
       System.out.println(v1==v3);
       String a=new String("v");
       String b=new String("v");
       System.out.println(a==b);  // dif obj dif ref var 
       
       // .equals 
       System.out.println(a.equals(b));

       // charAt () method , gives char at index 
       System.out.println(v.charAt(0));  
       // toString
       System.out.println(Arrays.toString(new int[]{2,1,3,4}));

       Integer x=new Integer(56);
    System.out.println(x.toString());
       

    // PrettyProgramming 
     float n=42.526f;
     System.out.printf("formated number: %.2f",n);
     
     System.out.printf("\nHellow my name is %s and I am %s\n","vnbl","Cool");
     
     // Ascii
     System.out.println('a'+'b');
     System.out.println((char)('a'+2));
     
     

    }
}