/* 
TCS NQT Coding Question 2023 – September Day 1 – Slot 1
Problem Statement –

Joseph is learning digital logic subject which will be for his next semester. He usually tries to solve unit assignment problems before the lecture. Today he got one tricky question. The problem statement is “A positive integer has been given as an input. Convert decimal value to binary representation. Toggle all bits of it after the most significant bit including the most significant bit. Print the positive integer value after toggling all bits”.

Constrains-

1<=N<=100

Example 1:

Input :

10  -> Integer

Output :

5    -> result- Integer

Explanation:

Binary representation of 10 is 1010. After toggling the bits(1010), will get 0101 which represents “5”. Hence output will print “5”.

*/ 

import java.util.*;
public class q48_toggleBits{
 public static int toggle(int n){
    double lg=Math.log(n)/Math.log(2);
    int k=(1<<(int)lg+1)-1;
    return n^k; 
  }
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.print(toggle(n));
    }
}