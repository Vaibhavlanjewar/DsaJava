
public class J44ExeptionHandling {
    public static void main(String args[]) {
        int i = 0;
        int j = 0;

        int nums[] = new int[5];

        try {
            j = 18 / i;
            if(j==0){
                throw new ArithmeticException("I dont want to print "); // trying to throw the error , catch block catch it 
            }
          
            
            System.out.println(nums[1]);
            System.out.println(nums[5]); // 6 th element is not present going out of bound
        } 
        catch (ArithmeticException e) { // catch block executes only whem the exception found
            // System.out.println("Someting Went wrong  " + e);
           
            // handle the error
            j=18/2; // default op 
            System.out.println("That the default op  "+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
         System.out.println("Out of boumd ");
        }
        catch(Exception e){
            System.out.println("wrong");
        }

        // System.out.println(j);
        System.out.println("Bye");

        /* for  j = 18 / 0;
         * Someting Went wrong java.lang.ArithmeticException: / by zero
         * 0
         * Bye
         */

        /*
         * 0
         * Someting Went wrong java.lang.ArrayIndexOutOfBoundsException: 5
         * Bye
         */
    }
}
