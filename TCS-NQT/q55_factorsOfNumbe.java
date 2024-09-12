
public class q55_factorsOfNumber {
    static int isPrime(int n){
        int[] isPrim =new int[n+1];
        Arrays.fill(isPrim,1);
        isPrim[0]=0;
        isPrim[1]=0;
        for(int i=2;i*i<=n;i++){
            for(int j=2*i;j<=n;j+=i){
                isPrim[j]=0;
            }
        }
        int cnt=0;
        for(int i:isPrim){
           if(i==1){
              cnt++;
           }
        }
        return cnt;
    }
    public static void main(String[] args) {

    }
}