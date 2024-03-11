public class selection_sort {
           public static void selctionsort(int arr[]){
            for(int i=0;i<arr.length-1;i++){
                int minpos=i;
                for(int j=i+1;j<arr.length;j++){
                 if(arr[minpos]>arr[j]){
                        minpos=j;
                    }
                }

                // swaps 
                int temp=arr[minpos];
                arr[minpos]=arr[i];
                arr[i]=temp;
            }

           }

            
            public static void printarr(int arr[]){
                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println("\n");
            }
            public static void main (String args[]){
                int arr[]={5,4,3,2,1};
                System.out.println("befor sorting \n");
                printarr(arr);
                selctionsort(arr);
                System.out.println("After soring");
                printarr(arr);

            }
    
}
