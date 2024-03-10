
public class bubble_sort {
    public static void bubsort(int arr[]){
        int swap=0;
        for(int turn =0;turn<arr.length-1;turn++){
            
            for(int j=0;j<arr.length-1-turn ;j++){
                 if(arr[j]<=arr[j+1]){
                    //swap 
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                 }  
            }
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
    }
    public static void main(String[]args){
        int arr[]={5,3,2,4,1};
        System.out.print("Original array : \n");
        printarr(arr);
        System.out.print("Sorted array in ascending order: \n");
        bubsort(arr);
        printarr(arr);

    }
    
}