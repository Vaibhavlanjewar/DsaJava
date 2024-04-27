public class Lt_875_koko_eat_banana_bs {
    //https://leetcode.com/problems/koko-eating-bananas/submissions/1242934711/?envType=study-plan-v2&envId=leetcode-75
    public static int minEatingSpeed(int[] arr, int h) {
        int low = 1, high = findMax(arr);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int totH = calculateTotalHour(arr, mid);
            if (totH <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static int calculateTotalHour(int[] arr, int h) {
        int totH = 0;
        for (int i : arr) {
            totH += (int) Math.ceil((double) i / h);
        }
        return totH;
    }

    public static int findMax(int[] arr) {
        int max = 0; //Integer.MIN_VALUE
        for (int num : arr) {
            max = Math.max(max, num);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 7, 11};
        int h = 8;
        System.out.println(minEatingSpeed(arr, h));
    }
}
