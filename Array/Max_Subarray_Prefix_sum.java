public class Max_Subarray_Prefix_sum {
    // prefix sum
    public static void subArr(int num[]) {

        int n = num.length;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[n];
        int Currsum = 0;

        //calculation of prefix sum 
        prefix[0] = num[0];
        for (int i = 1; i <prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }

        for (int i = 0; i < n; i++) {
            int start = i;
            for (int j = i; j < n; j++) {
                int end = j;
                Currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (Currsum > maxSum) {
                    maxSum = Currsum;
                }
            }
        }
        System.out.println("maximum sum: " + maxSum);
    }

    public static void main(String args[]) {
        int num[] = { 2, 4, 6, 8, 10 };
        int num2[] = { 1, -2, 6, -1, 3 };
        // subArr(num);
        subArr(num2);
    }
}
