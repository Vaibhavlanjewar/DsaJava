public class sum_natural_no {
    public static int sum(int n){
        if(n==0) return 0;
        System.out.println(n+" b4");
        return n+sum(n-1);

        /*
         for(int i=1;i<=n;i++){
            sum+=i;
         } 

         */
    }
    public static void main(String args[]){
        int n=5;
        int res=sum(n);
        System.out.println("sum of first natural no of "+n+" is "+res);


    }
}
