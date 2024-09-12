import java.util.Scanner;

public class q58StrongNumber {
    public static int fact(int n){
        if(n==0 ||n==1) return 1;
        return n*fact(n-1);
    }
    public static int isStrong(int N) {
        int sum=0;
        int a=N;
        while(N>0){
            int num=fact(N%10);
            sum+=num;
            N=N/10;
        }
        return sum==a? 1:0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isStrong(n));
    }
}
