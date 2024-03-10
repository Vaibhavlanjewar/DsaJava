public class factorial {
    public static int fact(int n){
        if (n==0 || n==1) return 1;
        return n*fact(n-1);
        
    }
    public static void main(String args[]){
        int n=5;
        int facto=fact(n);
        System.out.println("Factorial of  "+n+" is "+facto);
    }
    
}
