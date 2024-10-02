// /*Q1. Airport security officials have confiscated several items of the passenger at the security checkpoint. All 
// the items have been dumped into a huge box(array). Each item possessed a certain amount of risk(0,1,2). 
// Here is the risk severity of the item representing an array[] of N number of integer values. The risk here is to 
// sort the item based on their level of risk values range from 0 to 2. 
// Example 1: 
// Input: 
// 7     ----- Value of N 
// [1,0,2,0,1,0,2] -> Element of arr[0] to arr[N-1], while input each element is separated by new line 
// Output: 
// 0 0 0 1 1 2 2 -> Element after sorting based on the risk severity.   
// Example 2: 
// Input: 
// 10     ----- Value of N 
// [2,1,0,2,1,0,0,1,2,0] -> Element of arr[0] to arr[N-1], while input each element is separated by new line 
// Output: 
// 0 0 0 0 0 1 1 1 2 2 2 -> Element after sorting based on the risk severity.   
// Constraints 
// 0<N<=100 
// 0<=arr[i]<=2  */


// import java.util.*;

// public class AirportRiskSorter {

//     // Method to swap elements in the array
//     public static void swap(int[] nums, int i, int j) {
//         int temp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temp;
//     }

//     // Method to sort the array based on risk values
//     public static void sort(int[] nums) {
//         int start = 0, index = 0, end = nums.length - 1;

//         while (index <= end) {
//             if (nums[index] == 0) {
//                 swap(nums, index, start);
//                 index++;
//                 start++;
//             } else if (nums[index] == 2) {
//                 swap(nums, index, end);
//                 end--;
//             } else {
//                 index++; // Skip over 1s
//             }
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Prompt the user for the number of elements
//         System.out.print("Enter the number of items: ");
//         int n = scanner.nextInt();

//         // Check if n is within valid range
//         if (n <= 0 || n > 100) {
//             System.out.println("Please enter a valid number of items (0 < N <= 100).");
//             return;
//         }

//         // Prompt for the array input
//         System.out.print("Enter the items in the format [x,x,x,...]: ");
//         scanner.nextLine(); // Consume the newline character
//         String input = scanner.nextLine();

//         // Process input to create an integer array
//         input = input.replace("[", "").replace("]", "");
//         String[] strArray = input.split(",");
//         int[] nums = new int[strArray.length];

//         // Convert string inputs to integers
//         for (int i = 0; i < strArray.length; i++) {
//             nums[i] = Integer.parseInt(strArray[i].trim());
//         }

//         // Sort the array
//         sort(nums);

//         // Print the sorted array
//         System.out.print("Sorted items: ");
//         for (int num : nums) {
//             System.out.print(num + " ");
//         }
//         System.out.println(); // New line after output

//         scanner.close();
//     }
// }

// import java.util.*;

// public class AirportRiskSorter {

//     // Method to swap elements in the array
//     public static void swap(int[] nums, int i, int j) {
//         int temp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temp;
//     }

//     // Method to sort the array based on risk values
//     public static void sort(int[] nums) {
//         int start = 0, index = 0, end = nums.length - 1;

//         while (index <= end) {
//             if (nums[index] == 0) {
//                 swap(nums, index, start);
//                 index++;
//                 start++;
//             } else if (nums[index] == 2) {
//                 swap(nums, index, end);
//                 end--;
//             } else {
//                 index++; // Skip over 1s
//             }
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         List<Integer> numList = new ArrayList<>();  // List to store integers

//         System.out.println("Enter the risk values (0, 1, or 2), and press Ctrl+D (or Ctrl+Z on Windows) when done:");

//         // Read input values until no more integers are available
//         while (scanner.hasNextInt()) {
//             numList.add(scanner.nextInt());
//         }

//         // Convert the list to an array
//         int[] nums = numList.stream().mapToInt(i -> i).toArray();

//         // Sort the array
//         sort(nums);

//         // Print the sorted array
//         System.out.print("Sorted items: ");
//         for (int num : nums) {
//             System.out.print(num + " ");
//         }
//         System.out.println(); // New line after output

//         scanner.close();
//     }
// }
