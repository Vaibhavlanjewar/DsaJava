import java.util.*;
public class recSubsequence {
    public static void subseq(int ind, ArrayList<Integer> ds, int arr[], int n) {
        if (ind == n) {
            if (ds.size() == 0) {
                System.out.println("{}");
            } else {
                for (int i : ds) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            return;
        }

        // take the element
        ds.add(arr[ind]);
        subseq(ind + 1, ds, arr, n);

        // not take element
        ds.remove(ds.size() - 1);
        subseq(ind + 1, ds, arr, n);
    }
    public static void main(String args[]) {
        int arr[] = {3,1,2};
        int n = arr.length;
        ArrayList<Integer> ds = new ArrayList<>();
        subseq(0, ds, arr, n);
    }
}