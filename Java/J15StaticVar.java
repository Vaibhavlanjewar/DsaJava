
class Mobail{
    String brand;
    int price;
    static String name;

    // static block 
    static{
        name="SmartPhone";
        System.out.println("Inside static block");
    }
    public Mobail(String brand,int price){
         this.brand=brand;
         this.price=price;
         System.out.println("Inside the Consturctor");
    }
    public void show(){
        System.out.println(brand+" : "+price+" : "+name);
    }
}
public class J15StaticVar {
    public static void main(String[] args) {
        Mobail obj1=new Mobail("Apple",1500);
       

        Mobail obj2=new Mobail("Sony",15000);
        

    //     Mobail obj3=new Mobail("One +",510000);
  

    //    Mobail obj4=new Mobail("vivo",20000);
     
       
        obj1.show();
        obj2.show();
        // obj3.show();
        // obj4.show();

    }
}
