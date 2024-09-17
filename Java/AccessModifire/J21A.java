package AccessModifire;


class Lunch{
    
    public void abc(){
        J21A obj=new J21A();
        System.out.println("Marks,inside J21A ,pr"+obj.marks); // protected accessible in same class 
        }

}
public class J21A {
    protected int marks=6;
    protected int science=40;

}
