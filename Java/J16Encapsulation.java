// Encapsulation 
class Human{
    private int age; //this variable only accessible for this human class itself 
    private String name;// no one can access from outside world

     public Human(){ //default constructor hain 
        System.out.println("Default consturctor ");
     }

     public Human(int age,String name){ //parameterised constructor 
        this.age=age;
        this.name=name;
     }
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

    public void show(){
        System.out.println(this.name+" : "+ this.age);
    }

}
public class J16Encapsulation {
    public static void main(String args[]){
     Human obj=new Human(); //default consturctor is called 

     Human obj1=new Human(21,"Vaibhav"); // parametrise constructor called 
     obj1.show();

    //  obj.setAge(24,obj); // pass object as ref to method to set the age 
    //  obj.setName("Vaibhav");
    // System.out.println(obj.getName()+" "+obj.getAge());
    }
}
