import java.util.*;
public class Smallest_Largest {
    public static int getSmallest(int num[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i]<smallest){
                smallest=num[i];
            }

        }
        return smallest;
    }

    public static int getLargest(int num[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i]>largest){
                largest=num[i];
            }

        }
        return largest;
    }

    public static void main(String arg[]){
        int num[]={1,2,5,6,8};

        System.out.println("Largest number is : "+ getLargest(num));
        System.out.println("\nSmallest num is : " + getSmallest(num));
    }

}
