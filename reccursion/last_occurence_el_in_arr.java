public class last_occurence_el_in_arr {
    public static int loc(int arr[],int key , int n){
        if(n==0) return -1;
        if(arr[n]==key){
            return n;
        }
        return loc(arr,key,n-1);
    }
    public static void main(String args[]){
        int arr[]={8,3,6,9,5,10,2,5,3};
        System.out.println("first occ of 5 is at index : "+loc(arr,3,arr.length-1));
    }
    
}
 