public class q50_MaximumConsecutiveOnes {
    public static void main(String args[]){
        int arr[]={0,1,1,0,1,1,1,1,0};
        int m=Integer.MIN_VALUE;
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 ){
             cnt++;
            }
            else{
                m=Math.max(m,cnt);
                cnt=0;
            }
        }
        System.out.println(m);
    }
}


