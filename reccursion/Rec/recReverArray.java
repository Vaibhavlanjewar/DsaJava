public class recReverArray {
    public static void rev(int i, int j ,int arr[]){
        if(i>=j)return ;
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

        rev(i+1,j-1,arr);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        rev(0,arr.length-1,arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

}
