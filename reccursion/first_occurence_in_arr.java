public class first_occurence_in_arr {
    public static int foc(int arr[],int key , int i){
        if(i==arr.length) return -1;
        if(arr[i]==key){
            return i;
        }
        return foc(arr,key,i+1);
    }
    public static void main(String args[]){
        int arr[]={8,3,6,9,5,10,2,5,3};
        System.out.println("first occ of 5 is : "+foc(arr,5,0));
    }
    
}
