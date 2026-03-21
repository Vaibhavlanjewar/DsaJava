import java.util.ArrayList;

public class recPrintArrayOfTargetSum {
    public static void printSum(int ind, ArrayList<Integer> ds, int sum, int arr[], int n, int target) {
        if (sum == target) {
            for (int i : ds) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        if (ind == n) {
            return;
        }

        // condition to include the element
        ds.add(arr[ind]);
        sum += arr[ind];
        printSum(ind + 1, ds, sum, arr, n, target);
        // condition to exclude the element
        ds.remove(ds.size() - 1);
        sum -= arr[ind];
        printSum(ind + 1, ds, sum, arr, n, target);

    }

   public static boolean printSingleArray(int ind, ArrayList<Integer> ds, int sum, int arr[], int n, int target){
    if(ind==n){    
          if(sum==target){
              for(int i:ds){
                System.out.print(i+" ");
               }
            System.out.println();
            return true;
           }
           else return false;
    } 
        // condition to include the elementq
        ds.add(arr[ind]);
        sum+=arr[ind];
        if(printSingleArray(ind +1, ds,sum,arr,n,target)==true)return true;
        // condition to exclude the element
        ds.remove(ds.size()-1);
        sum-=arr[ind];

        if(printSingleArray(ind +1, ds,sum,arr,n,target)==true)return true;
        return false;
   }

   public static int countSubsequences(int ind,int sum,int arr[],int n,int target){
    // if arr contains only positive numbers then we can add this condition to optimize the code
    if(sum>target){
        return 0;
    }   

    if(ind==n){
        if(sum==target){
            return 1;
        }
        else return 0;
    }
    // condition to include the element 
    sum+=arr[ind];
    int Left=countSubsequences(ind+1,sum,arr,n,target);
    // condition to exclude the element
    sum-=arr[ind];
    int Right=countSubsequences(ind+1,sum,arr,n,target);
    return Left+Right;
   }

    public static void main(String args[]) {
        int n = 3;
        int target = 2;
        int arr[] = { 1, 2, 1 };

        ArrayList<Integer> ds = new ArrayList<>();
        // print all the subsequences with target sum
        // printSum(0, ds, 0, arr, n, target);

        // print only one subsequence with target sum
        // printSingleArray(0, ds,0,arr,n,target);
        
        // count the number of subsequences with target sum
        int result = countSubsequences(0, 0, arr, n, target);
        System.out.println("Count of subsequences with target sum: " + result);

    }
}
