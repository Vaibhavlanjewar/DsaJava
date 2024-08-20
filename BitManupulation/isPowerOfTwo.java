public class isPowerOfTwo {
    public static boolean isPowerOfTwo(int n){
        return (n&(n-1))==0 ;
    }

    // fast expo 
    public static int fastExpo(int a,int n ){
        int ans=1;
        while(n>0){
            if((n&1) !=0){
                ans*=a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(15));

        // fast expo 
        System.out.println("fast expo is "+ fastExpo(5,3));
    }
}
