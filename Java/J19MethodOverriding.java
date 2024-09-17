 class Calc{
    public int add(int a, int b){
        return a+b;
    }
 }

 class AdvCal extends Calc{
    //  override 
    // method has same name , has same parameter, 
    // same return type as declared in supper class , may have different behaviour 
    public int add(int a,int b){
        return a+b+1;
    }
 }

public class J19MethodOverriding {
    public static void main(String args[]){
        AdvCal c=new AdvCal();
        int add=c.add(5,4);
        System.out.println(add);
    }
}
