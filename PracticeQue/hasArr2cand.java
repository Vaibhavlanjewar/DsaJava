import java.util.Arrays;

public class hasArr2cand {
     public static boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        Arrays.sort(arr);
        int si=0,ei=n-1;
        while(si<ei){
            int sum=arr[si]+ arr[ei];
            if(sum==x){
                return true;
            }
            else if(sum<x){
                si++;
            }
            else{
                ei--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]={1,4,45,6,10,8};
        int x=16;
        System.out.println(hasArrayTwoCandidates(arr,arr.length,x));
    } 
}
