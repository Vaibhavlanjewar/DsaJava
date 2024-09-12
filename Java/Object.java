
class Calculator{
   int num1;
   int num2;
  public int add(int n1,int n2){
    System.out.println("Addition "+n1+n2);
    return 0;
  }

}

public class Object {
public static void main(String[] args) {

     int num1=1,num2=6;
     Calculator cal=new Calculator();
    int res= cal.add(num1,num2);
    System.out.println(res);
    //  int sum=num1+num2;
    //  System.out.println(sum);
}    
}

// object has properties and behaviours
// class->bluePrint 
// class file is compliled and converted into the byte codde 
