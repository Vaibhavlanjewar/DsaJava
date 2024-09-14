
class Mobail{
    String brand;
    int price;
    static String name;
    public void show(){
        System.out.println(brand+" : "+price+" : "+name);
    }
}
public class J15StaticVar {
    public static void main(String[] args) {
        Mobail obj1=new Mobail();
        obj1.brand="Apple";
        obj1.price=1500;
        Mobail.name="SmartPhone";

        Mobail obj2=new Mobail();
        obj2.brand="Sony";
        obj2.price=15000;
       Mobail.name="SmartPhone";

        Mobail obj3=new Mobail();
        obj3.brand="One +";
        obj3.price=510000;
       Mobail.name="SmartPhone";
       
        obj1.show();
        obj2.show();
        obj3.show();

    }
}
