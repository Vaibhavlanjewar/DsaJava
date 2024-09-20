
interface Computer {
    public abstract void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("Code,Compile,run...");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("Code ,compile,run :Faster");
    }
}

class Developer {
    public void devApp(Computer lap) {
        lap.code();
    }
}

public class J36Interface3 {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer vnbl = new Developer();
        vnbl.devApp(lap); // Code,Compile,run...
        vnbl.devApp(desk);// Code ,compile,run :Faster
        /*
         * Code,Compile,run...
         * Code ,compile,run :Faster
         */
    }
}
