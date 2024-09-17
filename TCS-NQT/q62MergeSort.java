public class q62MergeSort {
    public static void mergeSort(int[] arr, int si, int ei) {
        if (si >=ei) {
            return;
        }
        int mid = si +(ei-si)/2;

        // left part
        mergeSort(arr, si, mid);
        // right part
        mergeSort(arr, mid + 1, ei);

        // merge
        merge(arr, si, mid, ei);
    }

    public static void merge(int[] arr, int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;// to iterate the temp array 

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
            }
          
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        // copy the element from temp to the arr
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }

    public static void print(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 95, 2, 8 };
        print(arr);
        mergeSort(arr, 0, arr.length - 1);
        print(arr);
    }
}
