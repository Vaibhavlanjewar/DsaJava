package Sorting;
public class search_in_rotated_sorted_arr{
    public int search(int arr[], int tar, int si, int ei){
        if(si>ei) return -1;

        // recursive fun
        //case found
        if(arr[mid]==tar){
            return mid;
        }
        // mid on l1
        if(arr[si]<=arr[mid]){
        // case a
        if(arr[si]<=tar && tar>=arr[mid]){
            return search(arr,tar,si,mid-1);
        }
        else{
            // case b
            return search(arr, tar, mid+1,el);
        }

        }
         // l2
        else{
           // case a1
           if(arr[mid]<=tar && tar<=mid[ei]){
            return search(arr, tar, mid+1,ei);

           }
           else{
            // case b1
            retur search(arr,tar,si,mid-1);
           }
        }
        
    }
    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(search(arr,0,0,arr.length-1));

    }
}