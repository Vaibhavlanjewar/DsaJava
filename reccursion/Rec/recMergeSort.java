public class recMergeSort {

    public static void merge(int arr[],int low,int mid,int high){
        int temp[]=new int[high-low+1];

        int left=low;
        int right=mid+1;
        int k=0;

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                 temp[k++]=arr[left];
                 left++;
            }
            else{
                temp[k++]=arr[right];
                right++;
            }

        }
        // if any element remain in left array 
        while(left<=mid){
            temp[k++]=arr[left];
            left++;
        }

        // if any element remains in right array 
        while(right<=high){
            temp[k++]=arr[right];
            right++;
        }

        // put temp element into origin arr
        for(int i=0;i<temp.length;i++){
            arr[low+i]=temp[i];
           System.out.print(arr[low+i]+ " ");  // ✅ CORRECT
        }
       System.out.println();

    }
    public static void mergeSort(int arr[],int low ,int high){
        if(low>=high)return ;
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        
        merge(arr,low,mid,high);

    }
    public static void main(String args[]){
        int arr[]={3,1,2,4,1,5,6,2,4};
        int n=arr.length;

        mergeSort(arr,0,n-1);

        // print arr
        System.out.println("Sorted array:");
        for(int i:arr){
            System.out.print(i+ " ");
        }
    }
}
