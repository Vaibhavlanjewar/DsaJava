import java.util.*;
public class q11 {
    
    public static int step(int n){
        int s=0;
       for(int i=2;i<=n;i++){
         while(n%i==0){
            s+=i;
            n=n/i;
         }
       }
       return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(step(n));
    }
}

/*
Code


650. 2 Keys Keyboard
// https://leetcode.com/problems/2-keys-keyboard/description/?envType=daily-question&envId=2024-08-19
There is only one character 'A' on the screen of a notepad. You can perform one of two operations on this notepad for each step:

Copy All: You can copy all the characters present on the screen (a partial copy is not allowed).
Paste: You can paste the characters which are copied last time.
Given an integer n, return the minimum number of operations to get the character 'A' exactly n times on the screen. */