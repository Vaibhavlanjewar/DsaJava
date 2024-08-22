/*
Q1. A supermarket maintains a pricing format for all its products. A value N printed on each product. When 
the scanner reads the value N on the item, the product of all the digits in the value N is the price of the item. 
The task is to design a software  such that given the code of any item N the product(multiplication) of all the 
digits of value should be computed(price). 
Example 1: 
Input: 
5244 -->Value of N 
Output: 
160 -->Price 
Explanation: 
From the input above: 
Product of the digits: 5,2,4,4 
5*2*4*4 = 160 
Hence Output is 160

 */

 import java.util.*;
 public class q15_suppermarket_numbers_digit_sum {
 
    public static int bill(int n){
     //base condition 
     if(n/10 ==n) return 1;
 
     // task 
 
     return (n%10) * bill(n/10);
    
     }    
   
     
    // iterative approach 
    public static int itrBill(int n){
 
    int tot=1;
    while(n!=0){
    tot*=n%10;
    n=n/10;
    
    }
    return tot;
 
    }
 
 
     public static void main(String args[]){
     
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
 
      //System.out.println(bill(n));
 
      System.out.println(itrBill(n));
           
 
     }
 }
 