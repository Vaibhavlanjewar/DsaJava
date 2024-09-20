
abstract class A{
    public abstract void show();
}
public class J33AbstractInnerClass {
    public static void main(String args[]){
        A obj=new A(){
          public void show(){
            System.out.println("in abstract inner class ");
          }
        };
        obj.show(); // here we are creating the obj of inner class 
    }
}
