import java.util.Arrays;

public class pattern_bubble_select_sort {
    public static void main(String args[]){
        /*
        traingle 
         * * * *
         * * *
         * *
         *  

         */

        // trangle(4, 0);

        /*
        normal triangle 
         * 
         * *
         * * *
         
         */
        // NormalTraingle(4,0);

        // bubble sort 
        int arr[]={4,3,2,1};
        bubbleSort(arr,arr.length-1,0);
        // System.out.println(Arrays.toString(arr));

        // selection sort
        SelectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));

    }

    // bubble sort
    static void bubbleSort(int arr[],int r,int c){
        if(r==0){
            return ;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                // swap
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubbleSort(arr, r, c+1);
        }
        else{
            bubbleSort(arr, r-1, 0);
        }

    }

    // selection sort
    static void SelectionSort(int arr[],int r,int c,int max){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[max]){
                SelectionSort(arr,r, c+1,c);
            }
            else{
                SelectionSort(arr,r, c+1,max);
            }
        } 
        else{
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
            SelectionSort(arr,r-1, 0 ,0);
        }
    }

    static void trangle(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            trangle(r, c+1);
        }
        else{
            System.out.println(); //new line
            trangle(r-1, 0  );
        }
    }

    static void NormalTraingle(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            NormalTraingle(r, c+1);
            System.out.print("*");
        }
        else{
            NormalTraingle(r-1, 0  );
            System.out.println(); //new line
        }
    }

}
  