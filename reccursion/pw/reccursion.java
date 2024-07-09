

public class reccursion {
    public static void main(String args[]){
        // hello();
       //Fibbonacci code 
    //   System.out.println(fibbo(5));
     
    //  binary search 
    // int arr[]={1,2,6,3,4,5};
    // int s=0,e=arr.length;
    // int k=3;
    // System.out.println(BS(arr,k,s,e));

    // print dec 5 4  3 2 1
    // printDec (5);

    // 1 2 3 4 5 ...
    // printInc(5);

    // print dec and inc both for n=5
    // IncDec(5);

    // factorial
    // System.out.println(factorial(5));

    // sum of natural numbers 
    // System.out.println(SumOfNaturalNo(5));

    // sum of Digits in a given No , 123=1+2+3=6
    // System.out.println(digitSum(0));

    // Digit product -- 1234=1*2*3*4=24
    // System.out.println(digitProd(0));

    // reverse No 1234 -->4321
    // revN1(1234); way1
    // System.out.println(sum);
    
    // way2 for reversing the number
    // System.out.println(revN2(1234));
    // -------------

    // count the No of zeros in the given digit , 10001 ,here 3 zeros 
    // System.out.println(CntZerosinDigit(10));

    // ---------Array----------

    
}
 
 // count the No of zeros in the given digit , 10001 ,here 3 zeros 
  static int CntZerosinDigit(int n ){
    if(n%10==n)return 0;
    if(n%10!=0){
        return CntZerosinDigit(n/10);
    }
    return 1+CntZerosinDigit(n/10);

  }
    
  
    
    // ----- Reverse the number 1234-->4321
    // way 1
     static int sum=0;
    public static void revN1(int n){
     if(n==0)return ;
     int rem=n%10;
     sum+=sum*10+rem;
     revN1(n/10);
    }

    // way2 for reversing the number
    static int revN2(int n){
        int digit=(int)(Math.log10(n)+1);
        return helper(n,digit);
    } 
    private static int helper(int n , int digit){
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*(int)(Math.pow(10,digit-1)+helper(n/10,digit-1));
    }
    // ----------

    // 

    // Digit sum , 1234=1+2+3+4=10
    static int digitSum(int n){
        if(n/10==n)return 0 ;
        return n%10+digitSum(n/10);
    }

    // Digit prod , 1234=1*2*3*4=24
    static int digitProd(int n){
        if(n/10==n)return n;
        return n%10*digitProd(n/10);
    }

    //  factorial 
    static int factorial(int n){
        if(n==0 || n==1) return 1;
        return n*factorial(n-1);
    }

    //  sum of natural numbers 
    static int SumOfNaturalNo(int n){
        if(n==1)return 1;
        return n+SumOfNaturalNo(n-1);
    }

    // print in dec order 5 4 3 2 1
    static void printDec(int n){
        if(n==0) return ;
        System.out.println(n);
        printDec(n-1);
    }

    //  print in increasing order 1 2  3 4 5 
    static void printInc(int n){
        if(n==0) return ;
       
        printDec(n-1);
        System.out.println(n);
    }
   
//    dec and inc 
    static void IncDec(int n){
        if(n==0) return ;

        System.out.println(n);  // dec
        IncDec(n-1); 
        System.out.println(n); // inc
    }

   // fibonacci 
   static int fibbo(int n){
    if(n<2) return n;
    return fibbo(n-1)+fibbo(n-2);

}

// Binary search 
    static int BS(int[] arr, int k, int s, int e) {
       if(s>e) return -1;
       int mid=s+(e-s)/2;
       if(arr[mid]==k) return mid;
       if(arr[mid]>k){
        return BS(arr,k,mid-1,e);
       }
       return BS(arr,k,s,mid-1);

    }

// basic function call
    static void hello(){
        System.out.println("Hello World");
    }

    static void printN(int n){
        System.out.println(n);
    }
    
}

