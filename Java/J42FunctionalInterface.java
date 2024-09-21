
@FunctionalInterface
interface A{
    void show();
    // only single method  possible inside the finctional interfaces 
}
class B implements A{
    public void show(){
        System.out.println("In show");
    }
}

public class J42FunctionalInterface {
   public static void main(String args[]){
    // A obj=new B();
    // obj.show(); //In show

    A obj1=new A() {
        public void show(){
            System.out.println("In show in anonymous class");
        }
    };
    obj1.show(); // In show in anonymous class    

   }
}
