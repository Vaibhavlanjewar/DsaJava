
class A {
    public void show() {
        System.out.println("Show in class A ");
    }

    // inner class
    class B {
        public void config() {
            System.out.println("in config");
        }
    }

    // static class -- inner class
    static class C {
        public static void print() {
            System.out.println("Print inner static class C ");
        }
    }
}

public class J31InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        // how to access inner class
        A.B obj1 = obj.new B();
        obj1.config();

        // Show in class A
        // in config

        // static class c
        A.C obj2 = new A.C();
        obj2.print();

        // Print inner static class C
    }
}
