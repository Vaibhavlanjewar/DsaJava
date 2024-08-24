public class q20_equilibriumPoint {
    public static int equilibriumPoint(long arr[]) {
        // Your code here
        int n=arr.length;
        if(n==1) return (int)arr[0];
        if(n==2) return -1;

        long left[]=new long[n];
        long right[]=new long[n];

        long leftSum=0;
        for(int i=0;i<n;i++){
            leftSum+=arr[i];
            left[i]=leftSum;
            // System.out.println(left[i]);
        }

        long rightSum=0;
        for(int j=n-1;j>=0;j--){
            rightSum+=arr[j];
            right[j]=rightSum;
        }

        for(int i=0;i<n;i++){
            if(right[i]==left[i]){
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        long arr[]={1,3,5,2,2};
        System.out.println(equilibriumPoint(arr));
    }
}


   

