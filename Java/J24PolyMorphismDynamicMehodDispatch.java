
class A {
    public void show() {
        System.out.println("Show in A");
    }
}

class B extends A {
    public void show() {
        System.out.println("Show in B");
    }
}

class C extends A{
public void show(){
System.out.println("Show in c");
}
}

class D extends C {
    public void show() {
        System.out.println("Show inside d");
    }
}

public class J24PolyMorphismDynamicMehodDispatch {
    public static void main(String args[]) {
        // B obj=new B();
        // obj.show(); //Show in B

        A obj1=new A();
        obj1.show(); //Show in A



        // B obj2=new A(); // not possible 

        // A obj2=new C();
        // obj2.show(); //Show in c
 
        // C obj3=new A(); // Not possible  C->A X ,A->C yes , C-->C yes 

        C objd=new D();
        objd.show();//Show inside d

        objd=new C();
        objd.show(); //show in c

    }
}
