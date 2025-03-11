import java.util.*;

public class CSVInputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input: Reading comma-separated values as a string
        System.out.println("Enter comma-separated values:");
        String input = sc.nextLine();
        
        // Split the string by commas and convert to integer array
        String[] strArray = input.split(",");  // Splitting based on comma
        int[] arr = new int[strArray.length];
        
        // Convert string values to integers
        for (int i = 0; i < strArray.length; i++) {
            arr[i] = Integer.parseInt(strArray[i].trim()); // Trim to remove spaces
        }

        // Display the array
        System.out.println("Array elements: " + Arrays.toString(arr));
    }
}
