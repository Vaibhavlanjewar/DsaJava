abstract class Car{
    public abstract  void drive(); // 
    public abstract void speed();
    public void playMusic(){
        System.out.println("Play Music");
    }
}

abstract class WagonR extends Car{
    public void drive(){
        System.out.println("Driving...");
    }
    // speed is not implemented here , hence Class being abstract 
}

class UpdatedWagonR extends WagonR{
    public void speed(){
        System.out.println("120 Kmph");
    }
}

public class J30AbstarctKeyword {
    public static void main(String[] args) {
//type may be Abstarct -->Object of Derived /Extended class 
        Car obj=new UpdatedWagonR();
        obj.drive();
        obj.playMusic();

        WagonR obj1=new UpdatedWagonR();
        obj1.drive();
        obj1.playMusic();

        UpdatedWagonR obj2=new UpdatedWagonR();
        obj2.drive();
        obj2.playMusic();
    }
}
