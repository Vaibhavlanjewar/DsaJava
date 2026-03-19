import java.util.*;

public class print_1_n{
     static void rec(int n){
        if(n==1){
            System.out.println(1);
            return ; 
        }
        rec(n-1);
        System.out.println(n);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        rec(n);
    }
}