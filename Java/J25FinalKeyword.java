

class cal{
    public final void show(){
        System.out.println("Final");
    }
    public int add(int a,int b){
        return a+b;
    }
}
class AdvC extends cal{
    // public void show(){ //cannot override this method 
    //     System.out.println("In B show");
    // } 
}
public class J25FinalKeyword {
    public static void main(String[] args) {
        AdvC obj=new AdvC();
    //    obj.show(); // Final method Not override 

    final double pi=3.14;
    // pi=4; no change is possible in final variable , act as constnt 
    System.out.println(pi);

    //  final class cannot be extended / inherited 

    }
}
