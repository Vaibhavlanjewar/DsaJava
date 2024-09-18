class A {
    public static void show1() {
        System.out.println("Show1 in A");
    }
}

class B extends A {
    public void show2() {
        System.out.println("Show2 in B");
    }
}
 
public class J27UpcastingDownCasting {
    public static void main(String[] args) {
     // type of A , Object is B   
        A obj1 = new B();
        // same as,A obj1= (A) new B() 
        // known as Upcasting ,implicitely done , no need to mention 
        obj1.show1();
        // obj1.show2(); undefined for type A
          
        // down casting 
        B obj2=(B) obj1;
        obj2.show1();
        obj2.show2();  //undefined for type B


  
    




    }
}
