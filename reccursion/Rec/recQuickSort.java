public class recQuickSort {

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int arr[], int low, int high) {
        int i = low;
        int j = high;
        int pivot = arr[low];

        while (i < j) {

            // check greater element from left side than pivot
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            // check smaller element from right than pivot
            while (arr[j] > pivot && j > low) {
                j--;
            }

            if (i < j) swap(arr, i, j);
        }

        swap(arr, low, j);
        return j;
    }

    public static void quickSort(int arr[], int low, int high) {

        if (low < high) {
            int pIndex = partition(arr, low, high);

            quickSort(arr, low, pIndex - 1);
            quickSort(arr, pIndex + 1, high);

        }

    }

    public static void main(String args[]) {
        int arr[] = { 3, 1, 2, 4, 1, 5, 6, 2, 4 };
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        // print arr
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}