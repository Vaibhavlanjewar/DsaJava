import java.util.Arrays;

public class TwoRepeatedElements {
    public static void twoRepeated(int arr[], int n)
    {
       int[] ans=new int[2];
       Arrays.sort(arr);
       int k=0;
       for(int i=0;i<n+1;i++){

          if(arr[i]==arr[i+1]){
                ans[k]=arr[i];
                k++;
               
            }
        
       }
       // 1,1,2,3,3,4
      // return ans;
      for(int i=0;i<2;i++){
        System.out.println(ans[i]+" ");
      }
    }

    public static void main(String args[]){
        int n=4;
        int arr[]={1,2,1,3,4,3};
        twoRepeated(arr, n);
        
    }
}
