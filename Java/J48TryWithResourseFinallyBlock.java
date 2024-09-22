import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J48TryWithResourseFinallyBlock {
    public static void main(String args[]) throws IOException{
        int i=0;
        int j=0;
        int num=0;
        
        try( BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
            // j=18/i;
            // InputStreamReader in=new InputStreamReader(System.in);
            // BufferedReader br=new BufferedReader(in);
            num=Integer.parseInt(br.readLine());
         System.out.println(num);

        }

        // catch(Exception e){
        //     System.out.println("Something went wrong");
        // }

        // // whenever we dont have to use the catch block along with try vlock we prefer the try block 
        // finally{
        //     br.close();
        //     System.out.println("Finally block executes compulsorily and Close the Resourse ");
        // }
    }

}
