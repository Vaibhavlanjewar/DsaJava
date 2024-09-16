
class A{
    public A(){
        super();  //by default present to call the constructor of supper class 
        System.out.println("In  A");
    }
    public A(int n){
        super();
        System.out.println("In A int");
    }
    }
    class B extends A{
        // every constructor has method called supper 
        public B(){
            super(); // supepr  call default constructor 
            System.out.println("In B ");
        }
    
        public B(int n){
            super(n); // call parameterised constructor of supper class 
            System.out.println("In Int ");
        }

        public B(String v){ 
            this(); // this() call the constructor of same class 
            System.out.println("This");
        }
       
    }
    public class J17ThisandSupperMethod {
        public static void main(String args[]){
            // B obj1=new B(); //default constuctor of A , B called 
            // B obj2=new B(5); // parameterised constructor of B is called 

            B obj3=new B("this "); 

            // Annonymous Object has no refrence variable 
            // new B();
        }
         
    }
    

    /* 
     Camel casing 

     class and Interfaces - Calc .Human ,Human(  ), Start with cap 
     Variables and method - marks(),score(), name --> small 
     Constants -->Capital PIE ,

     showMymarks -->cammel casing 

    //  Snake casing -> show_my_marks 
     */