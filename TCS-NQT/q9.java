import java.util.Scanner;

public class q9 {
    // gcd/hcf
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        if(a==0){
            System.out.println(b);
            return  ;
        }
        else if(b==0){
            System.out.println(a);
            return ;
        }

        while(a!=b){
            
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
            if(a==b){
                System.out.println(a);
            }
        }
    }
}
