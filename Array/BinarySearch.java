public class BinarySearch {
    public static int binarySearch(int num[],int key){
        int start=0 , end=num.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]<key){
                // right side 
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
       return -1; 
    }

    public static void main(String args[]){
        int num[]={2,4,6,8,10,14,15};
        int key=14;
        System.out.println("index of key is: "+ binarySearch(num, key));
    }
}
