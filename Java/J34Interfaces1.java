class Laptop {
    public void code() {
        System.out.println("Code,Compile,run...");
    }
}
class Desktop{
    public void code(){
        System.out.println("Code ,compile,run");
    }
}

class Developer {
    public void devApp(Laptop lap) {
        lap.code();
    }
}

public class J34Interfaces1 {
    public static void main(String[] args) {
        Laptop lap = new Laptop();
        Desktop desk=new Desktop();

        Developer vnbl = new Developer();
        vnbl.devApp(lap);

        /*
         * va> java J34Interfaces.java
         * Code,Compile,run...
         */

         Developer obj=new Developer();
        //  obj.devApp(desk); not work 
    }
}
