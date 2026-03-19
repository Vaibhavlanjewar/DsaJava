import java.util.Arrays;

public class pattern_sort {
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
        // bubbleSort(arr,arr.length-1,0);
        // System.out.println(Arrays.toString(arr));

        // selection sort
        // SelectionSort(arr, arr.length, 0, 0);
        // System.out.println(Arrays.toString(arr));

        // merge sort
        // mergeSortInplace(arr, 0, arr.length);
        // System.out.println(Arrays.toString(arr));

    //    Quick sort 
         QuickSort(arr, 0, arr.length-1);
         System.out.println(Arrays.toString(arr));
    }

     // Quick sort 
     static void QuickSort(int nums[],int low,int hi){
        if(low>=hi) return ;
        int s=low,e=hi;
        int m=(s+e)/2;
        int pivot=nums[m];

        while(s<=e){
           while(nums[s]<pivot){
            s++;
           } 
           while(nums[e]>pivot){
            e--;
           }
        //    swap 
        if(s<=e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }
    QuickSort(nums,low,e);
    QuickSort(nums,s,hi);


     }


    // ---------------------------
    // merge sort 
      static void mergeSortInplace(int[]arr,int s,int e){
        if(e-s==1) return ;
        int mid=(s+e)/2;
        mergeSortInplace(arr, s, mid);
        mergeSortInplace(arr, mid, e);

        mergeInplace(arr,s,mid,e); 

      }
      private static void mergeInplace(int arr[],int s,int m,int e){
        int mix[]=new int[e-s];

        int i=s;
        int j=m;
        int k=0;
        while (i<m && j<e) {
            if(arr[i]<arr[j]) {
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        // it may be possible any one of arr is not complete
        while(i<m){
            mix[k]=arr[i];
            k++;
            i++;
        }

        while(j<e){
            mix[k]=arr[j];
            k++;
            j++;
        }

    //   copy the ele from the mix to the arr
    
    for(int l=0;l<mix.length;l++){
        arr[s+l]=mix[l];
    }

      }


    //   ------------------

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
  