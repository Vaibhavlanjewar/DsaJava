
/* 
 The task is to write a program to calculate the total shipping cost based on the weight of the package and the distance it needs to travel. The shipping cost is determined by the following criteria:

Base money: $5.00
Cost per kilogram: $2.00
Cost per 10 kilometers: $0.50


example :
Weight (w): 10 kg
Distance (D): 100 km
Output: $30.00


*/

import java.util.*;
public class q18_Cost_of_shipping_14_5_24 {
    public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
    int wt=sc.nextInt();
    int d=sc.nextInt();

    double base=5.0;
    double costPrKg=2.00;
    double distPerKm=0.05;   //0.5/10=0.05
 
    double totalCost=wt*costPrKg + d*distPerKm + base;

    System.out.print(totalCost);
    
    }
}


