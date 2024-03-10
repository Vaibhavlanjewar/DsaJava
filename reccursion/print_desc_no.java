package reccursion;

import java.util.Scanner;

public class print_desc_no {
    public static void rec(int n) {
        if (n == 0)
            return;
        // print 1 2 3 ... n
        // rec(n-1);
        // System.out.println(n);

        // print n n-1 ....1
        System.out.println(n);
        rec(n - 1);

    }

    public static void decrec(int n) {
        if (n == 0)
            return;
        // print n n-1 ....1
        System.out.println(n);
        rec(n - 1);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for asc rec and 2 for dec rec ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Asc rec ");
                int num = sc.nextInt();
                rec(num);
                break;
            case 2:
                System.out.println("Asc rec ");
                int num1 = sc.nextInt();
                decrec(num1);
                break;

            default:
                break;
        }
    }

}
