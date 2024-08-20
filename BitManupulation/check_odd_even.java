public class check_odd_even {
    public static void oddEven(int n){
        int bitmask=1;
        if(( n & bitmask ) == 0){
            System.out.println(n + " is even");
        }
        else{
            System.out.println(n + " is odd");
        }
    }
public static void main(String args[]){
    oddEven(5);
    oddEven(7);
}

}
