class A{
    public void showDataBelongtoClass(){
        System.out.println("in A show");
    }
}
class B extends A{
    @Override 
    public void showDataBelongtoClass(){
        System.out.println("in B show");
    }
}

public class J41Annotation {
   public static void main(String[] args) {
    B obj=new B();
    obj.showDataBelongtoClass();
   }
// in B show    
}
