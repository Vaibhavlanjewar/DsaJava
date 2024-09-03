public class ArithmaticOperator {
 public static void main(String[] args) {
    
    // Assignment /Arithematic operator 
    System.out.println("AssignMent operator / arithematic operator ");
    // 1. Addition 
    int a=12;
    int b=6;
    System.out.println("a="+a+"  b="+b);
    int sum=a+b;
    System.out.println("Sum of a and b is: "+sum);

    // 2.subtraction 
    
    int diff=a-b;
    System.out.println("Difference of c and d is: "+diff);

    // 3. multiplication 
    int mul=a*b;
    System.out.println("mul: "+mul);

    // 4. division 
    int div=a/b;
   System.out.println("Div: "+div);
    // 5. modulo --> remainder 
    int rem=a%b;
    System.out.println("rem "+rem);

    // increament 
    int i=10;
    // pre-Inc 
    System.out.println("Before increament: "+i);
    int res=++i; //first assign then inc 
    System.out.println("After pre increament: "+res); //11
    
    i=10;
    // post inc
    System.out.println("Before increament: "+i);
    res=i++; //first inc and then fetch the val 
    System.out.println("After post increament  : "+res); //10

    

 }   
}
