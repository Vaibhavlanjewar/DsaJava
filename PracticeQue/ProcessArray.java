import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input as a single line
        String input = scanner.nextLine();
        
        // Parse input into an array of integers
        String[] inputTokens = input.split("\\s+");
        int[] numbers = new int[inputTokens.length];
        for (int i = 0; i < inputTokens.length; i++) {
            numbers[i] = Integer.parseInt(inputTokens[i]);
        }

        // Process the array
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            if (num < 58 && num % 4 == 0) {
                numbers[i] = -8; // Both supported and unsupported
            } else if (num % 4 == 0) {
                numbers[i] = -3; // Supported number
            } else if (num < 58) {
                numbers[i] = -2; // Unsupported number
            }
        }

        // Print the processed array as space-separated integers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(" "); // Add a space between numbers
            }
        }
    }
}
