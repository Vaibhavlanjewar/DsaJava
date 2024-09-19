
class A {
    public void show() {
        System.out.println("in A show");
    }
}

public class J32AnnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A() {
            // inner Anonymous class
            public void show() {
                System.out.println("in a new Annonymous show");
            }

        };
        obj.show();

    }
    // in a new Annonymous show
}
