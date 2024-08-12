import Bank.Bank;

class Shape {
    public void printArea() {
        System.out.println("Area display");
    }
}

// Single level inheritance
class Triangle extends Shape {
    int l;
    int b;

    Triangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public void printArea(int l, int b) {
        System.out.println(0.5 * l * b);
    }
}

// Hierarchical inheritance
class Rectangle extends Shape {
    public void printArea(int l, int b) {
        System.out.println(l * b);
    }
}

// Abstract class 
 abstract class Animal{
    Animal(){
        System.out.println("You are creating an Animal ");
    }
   abstract  public void walk();
}
class Horse extends Animal{
    Horse(){
    System.out.println("Horse created ");
    }
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Walk on two legs");
    }
}

// Interfaces 
interface Car{
  String brand="Car";
 void speed();
 void average();
}
interface Suv {
     String brand = "SUV";
    void seatCount();
}
class Bmw implements Car,Suv{
 public void speed(){
    System.out.println("Bmw Spedd :450 km/hr");
 }

@Override
public void average() {
    System.out.println("20km/ltr");
    
}

@Override
public void seatCount() {
    // TODO Auto-generated method stub
    System.out.println("7 seater");
   
}
}
public class oops {
    public static void main(String[] args) {
        // Triangle t = new Triangle(6, 3);
        // t.printArea(1, 2);
        
        // Rectangle r = new Rectangle();
        // r.printArea(4, 5);

        // Bank.Accounts acc1=new Bank.Accounts("Vaibhav");
        // acc1.printAcHolderName();

        Horse horse=new Horse();
        horse.walk();
        
        // interface 
        Bmw bmw=new Bmw();
        bmw.speed();
        bmw.average();

    //  Animal animal=new Animal(); //we cannont instantiate the object of abstact class 
        
    }

    // Data hidding can be achieved by Encapsulation 
// abstraction -->show important property ,methods to user

//  static keyword is same throught the classs 

}
