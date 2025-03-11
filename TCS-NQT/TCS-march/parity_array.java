public class parity_array{
    // 4-3-2025

   public  static boolean parity(int arr[]){
        if(arr.length==1){
            return true;
        }
        for(int i=0;i<arr.length-1;i++){
            if((arr[i]%2==0 && arr[i+1]%2==0)||(arr[i]%2==1 && arr[i+1]%2==1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5};
        boolean ans=parity(arr);
        System.out.println(ans);
    }
}