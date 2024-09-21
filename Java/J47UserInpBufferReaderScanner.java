import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.BufferUnderflowException;
import java.util.Scanner;

public class J47UserInpBufferReaderScanner {
    public static void main(String[] args) throws IOException {
        // System.out.println("Enter number");
        // int num = System.in.read(); // give ASCII VALUE FOR GIVEN INPUT NUMBER
        // System.out.println(num-48); //WE HAVE TO SUBSTRACT ONE CHARACTER 
        /*
         * Enter number
         * 0
         * 48
         */

         //BUFFER READER
        //  InputStreamReader in=new InputStreamReader(System.in) ;
        //  BufferedReader bf=new BufferedReader(in); 
        //  int num=Integer.parseInt(bf.readLine()); //readline give string of number
        //  System.out.println(num);
 
        // bf.close(); // buffer reader use the resource , hence we close the resourse 

        // better way Scanner 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num2");
        int n=sc.nextInt();
        System.out.println(n);
        
    }
}
