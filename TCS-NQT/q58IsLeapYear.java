import java.util.Scanner;

public class q58IsLeapYear {
    public static int isLeap(int N){
        //code here
        if(N%100 !=0 && N%4==0 || N%400==0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int yr=sc.nextInt();
        System.out.println(isLeap(yr));
    }
}
