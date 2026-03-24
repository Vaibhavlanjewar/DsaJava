import java.util.ArrayList;

public class recCombination77 {

    public static void findCombination(int ind, int n, int k, ArrayList<ArrayList<Integer>> ans,
            ArrayList<Integer> ds) {

        if (k == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        if (ind > n) {
            return;
        }

        // if(ind==0) continue;
        // pick
        ds.add(ind);
        findCombination(ind + 1, n, k - 1, ans, ds);

        ds.remove(ds.size() - 1);
        findCombination(ind + 1, n, k, ans, ds);

    }

    public static void main(String args[]) {
        int n = 4;
        int k = 2;

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int ind = 1;
        ArrayList<Integer> ds = new ArrayList<>();
        findCombination(ind, n, k, ans, ds);

        System.out.println(ans);
    }
}
