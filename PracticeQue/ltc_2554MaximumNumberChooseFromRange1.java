import java.util.HashSet;

public class ltc_2554MaximumNumberChooseFromRange1 {

    public static int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> st = new HashSet<>();
        
        // Keep the banned numbers that are less than or equal to n in a set
        for (int i = 0; i < banned.length; i++) {
            if (banned[i] <= n) {
                st.add(banned[i]);
            }
        }

        int currSum = 0, cnt = 0;

        // Loop over numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            if (!st.contains(i) && currSum + i <= maxSum) {
                currSum += i;
                cnt++;
            }
        }

        return cnt;
    
    }

    public static void main(String[] args) {
        int banned[] = { 1, 6, 5 };
        int n = 5;
        int maxsum = 6;
        int res=maxCount(banned, n, maxsum);
        System.out.println(res);
    }
}
