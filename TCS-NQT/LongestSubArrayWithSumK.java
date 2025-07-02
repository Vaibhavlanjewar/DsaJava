import java.util.*;

public class LongestSubArrayWithSumK {
    
    public static int longestSubArray(int nums[], int n, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int sum = 0, maxLength = 0; // Initialize maxLength to 0

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            // Check if sum equals k
            if (sum == k) {
                maxLength = i + 1;
            }

            // Check if (sum - k) exists in the map
            if (mp.containsKey(sum - k)) {
                int length = i - mp.get(sum - k);
                maxLength = Math.max(maxLength, length);
            }

            // Store first occurrence of sum in map
            if (!mp.containsKey(sum)) {
                mp.put(sum, i);
            }
        }
        
        return maxLength;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Read input array as a comma-separated string
        System.out.println("Enter array elements separated by commas:");
        String inp = sc.nextLine();
        System.out.println("You entered: " + inp);  // Debug print

        String str[] = inp.split(",");
        int n = str.length;
        int nums[] = new int[n];

        // Convert string input to integer array
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(str[i].trim()); // Trim spaces
        }

        // Read k (target sum)
       
            int k = sc.nextInt();
            System.out.println("You entered k: " + k);  // Debug print

            // Call function and print result
            System.out.println("Longest subarray length: " + longestSubArray(nums, n, k));
     

        sc.close(); // Close the scanner
    }
}
