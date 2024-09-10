import java.util.Arrays;

public class q51_IsPrime_SeiveOfEratoSthenes {
    public static void main(String args[]){
        int n=20;
        boolean isPrime[]=Checkprime(n);
        for(int i=0;i<=n;i++){
          if(isPrime[i]==true){
            System.out.print(i+" ");
          }
        }

    }
    public static boolean[] Checkprime(int n){
        boolean []isPrime=new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;

        for(int i=2;i*i<=n;i++){
           for(int j=2*i;j<=n;j+=i){
            isPrime[j]=false;
            }
         }
      return isPrime;
    }

}
