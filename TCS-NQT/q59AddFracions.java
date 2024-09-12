//https://www.geeksforgeeks.org/problems/add-two-fractions/1

import java.util.Scanner;

public class q59AddFracions {
    public static int findGcd(int a, int b){
        if(b==0)
          return a;
        return findGcd(b, a%b);
    }
    public static void addFraction(int num1, int den1, int num2, int den2)
    {
        // Your code here
        
      
        int d = den1*den2;
        int n = num1*den2 + num2* den1;
        
        int gcd = findGcd(n,d);
        n /= gcd;
        d /= gcd;
        
        System.out.println(n+"/"+d);
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int den1=sc.nextInt();
        int den2=sc.nextInt();
    }

}
