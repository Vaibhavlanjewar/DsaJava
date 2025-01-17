
/*Input: arr[] = [10, 3, 5, 6, 2]
Output: [180, 600, 360, 300, 900]
Explanation: For i=0, res[i] = 3 * 5 * 6 * 2 is 180.
For i = 1, res[i] = 10 * 5 * 6 * 2 is 600.
For i = 2, res[i] = 10 * 3 * 6 * 2 is 360.
For i = 3, res[i] = 10 * 3 * 5 * 2 is 300.
For i = 4, res[i] = 10 * 3 * 5 * 6 is 900. */

public class puzzle_arr {
    public static int[] productExceptSelf(int arr[]) {
        // code here
       int tot=1;
       int n=arr.length;
       for(int i=0;i<n;i++){
           tot*=arr[i];
       }
       for(int i=0;i<n;i++){
        arr[i]=tot/arr[i];
       }
     return arr;  
    }

    public static void main(String args[]){
        int arr[]={10, 3, 5, 6, 2};
        arr=productExceptSelf(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
