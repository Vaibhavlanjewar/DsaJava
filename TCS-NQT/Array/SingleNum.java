import java.util.*;

public class SingleNum {

  public static int findSingleNum(int arr[]) {
    HashMap<Integer, Integer> mp = new HashMap<>();

    for (int i = 0; i < n; i++) {
      mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
    }
    int ans = 0;
    for (int i : arr) {
      if (mp.get(i) == 1) {
        ans = i;
        break;
      }
    }
    return ans;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.print(findSingleNum(arr));
  }
}