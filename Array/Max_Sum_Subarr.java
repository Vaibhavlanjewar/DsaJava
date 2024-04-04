public class Max_Sum_Subarr {
    public static void subArr(int num[]){
     
        int n=num.length;
        int maxSum=Integer.MIN_VALUE;
        int Currsum=0;
        for(int i=0;i<n;i++){
            int start=i;
            for(int j=i;j<n;j++){
                int end=j;
                Currsum=0;
                for(int k=start;k<=end;k++){
                    // System.out.print(num[k]+" ");
                    Currsum+=num[k];
                }
             System.out.println(Currsum);
             if(Currsum>maxSum){
                maxSum=Currsum;
             }
             }
         }
       System.out.println("maximum sum: "+maxSum);
    }

    public static void main(String args[]){
        int num[]={2,4,6,8,10};
        int num2[]={1,-2,6,-1,3};
      //  subArr(num);
        subArr(num2);
    }
}
