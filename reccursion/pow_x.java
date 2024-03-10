public class pow_x {
    public static int power(int x, int n){
        if( n==0) return 1;
        return x*power(x,n-1);
    }

    public static int Optpower(int x, int n){
        if(n==0) return 1;
        int half=Optpower(x,n/2)*Optpower(x,n/2);
        // if n is odd 
        if(n%2==1){
            half=x*half;
        }
        return half;

    }
    public static void main(String args[]){
        int x=2;
        int n=10;
        System.out.println("2^10 = "+power(x,n));
        System.out.println("by half power meth "+Optpower(x,n));
    }
    
}
