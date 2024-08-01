import java.util.Scanner;

public class String_basic {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the string");
        // String str=sc.nextLine();
        // String str="VaibhaV";
        // System.out.println(str.lastIndexOf('V'));

    //     // convert the String into the array 
    //     String location="pune,chennai,bangalore,mumbai";
    //     String mylocation[]=location.split(",");
    //     for(int i=0;i<mylocation.length;i++){
    //    System.out.println(mylocation[i]+"");
    //     }

    String email1="vaibhavl523@gmail.com";
    String email2="vaibhavl523@hotmail.com";
    
    String email[]=email1.split("@");
    String lastpart=email[email.length-1];
    int dotindex=lastpart.lastIndexOf('.');
System.out.println(lastpart.substring(0, dotindex));

    }
}
 