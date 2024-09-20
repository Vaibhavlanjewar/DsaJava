//  class -class --> extends .
//  class to interfce -->Implements
//  Interface to Interface ->extends 
interface A {
    int age = 44;
    String area = "Pune";

    // variables are of type Final - Static
    void show();

    void config();

}
interface X{
    void run();
}
interface Y extends X{
    
}

//     implements A,X
class B implements A,X{
    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }
    public void run(){
        System.out.println("Run ....");
    }
}

public class J37Interface4 {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();
        // obj.run() not run 
      
        X obj2=new B();
        obj2.run();

        System.out.println(A.area); //pune
 
        /*
         * in show
         * in config
         * Run ....
         * Pune
         */
        // A.name="Bhandara"; not possible 
        //interface has no memory  
       
    }
}
