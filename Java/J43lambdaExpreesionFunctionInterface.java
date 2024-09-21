@FunctionalInterface
interface A{
    int add(int i,int j);
}

public class J43lambdaExpreesionFunctionInterface {
 public static void main(String[] args) {
    //  lambda expression  works with Functional interface 
    A obj=(i,j)->i+j;

   int res=obj.add(5,4);
   System.out.println(res); //9     
 }   
}
