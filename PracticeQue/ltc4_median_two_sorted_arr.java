import java.util.Arrays;

public class ltc4_median_two_sorted_arr {
    // https://leetcode.com/problems/median-of-two-sorted-arrays/
    // https://www.geeksforgeeks.org/problems/median-of-2-sorted-arrays-of-different-sizes/1
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;
        int nums[] = new int[n];
        int k = 0, j = 0;
        int mid = 0;
        double res = 0;
        for (int i = 0; i < n1; i++) {
            nums[i] = nums1[k++];
        }
        for (int i = n1; i < n; i++) {
            nums[i] = nums2[j++];
        }

        Arrays.sort(nums);
        mid = n / 2;
        if (n % 2 == 0) {
            res = (nums[mid] + nums[mid - 1]) / 2.0;
            // return res;
        } else {
            res = nums[mid];
            // return res
        }
        return res;
    }

    public static void main(String args[]) {

        int nums1[] = { 1, 3 };
        int nums2[] = { 2 };
        System.out.println(findMedianSortedArrays(nums1, nums2));

    }

}
