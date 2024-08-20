public class CountsetBit {
    public static int CountsetBit(int n){
        int count=0;
        while(n>0){
            if( (n&1) !=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    
    public static void main(String[] args) {
        System.out.println(CountsetBit(10)); // Output: 2
    }
}
