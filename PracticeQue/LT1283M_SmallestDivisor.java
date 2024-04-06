import java.util.*;

// https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/submissions/1224733713/
//https://www.geeksforgeeks.org/problems/smallest-divisor/1
public class LT1283M_SmallestDivisor {
    public static int maxi(int[] nums) {
        // Vector<Integer> arr = new Vector<Integer>();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int num : nums) {
            arr.add(num); // Boxing: converting int to Integer and adding to the vector
        }
        Integer max = Collections.max(arr);
        return max;
    }

    public static int sumByD(int[] nums, int d) {
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + Math.ceil((double) nums[i] / (double) d);
        }
        return (int) sum;
    }

    public static int smallestDivisor(int[] nums, int K) {
        int low = 1;
        int high = maxi(nums);

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sumByD(nums, mid) <= K) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String args[]) {
        int nums[] = { 1, 2, 5, 9 };
        System.out.println("The Smallest Divisor is " + smallestDivisor(nums, 6));
    }
}