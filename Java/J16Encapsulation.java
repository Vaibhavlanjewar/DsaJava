// Encapsulation 
class Human{
    private int age; //this variable only accessible for this human class itself 
    private String name;// no one can access from outside world

     //setter
     public void setName(String name){  // here this keywor-->current object 
        this.name=name;
     } 
     public void setAge(int age,Human obj){
        Human obj1=obj;
        obj1.age=age;
     }
    // getter
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }


}
public class J16Encapsulation {
    public static void main(String args[]){
     Human obj=new Human();
     obj.setAge(24,obj); // pass object as ref to method to set the age 
     obj.setName("Vaibhav");
    System.out.println(obj.getName()+" "+obj.getAge());
    }
}
