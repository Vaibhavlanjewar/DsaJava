
class CustomException extends Exception {
    public CustomException(String str) {
        super(str);
    }
}

class A {
    public void show() {
        try {
            Class.forName("Demo");
        } catch (ClassNotFoundException e) {
            System.out.println("Not ble to find the class " + e);
        }
    }
}

public class J46DuckingThrowException {
    static {
        System.out.println("class loaded");
    }

    public static void main(String[] args) {
        A obj = new A();
        obj.show();

    }
}
/*
 * class loaded
 * Not ble to find the class java.lang.ClassNotFoundException: Demo
 */
