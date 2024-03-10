public class print_asc_order{
    public static void inc(int n){
        if(n==0) return ;
        inc(n-1);
        System.out.println(n+" ");
    }
    public static void main(String args[]){
        int n=5;
        inc(n);
    }
}