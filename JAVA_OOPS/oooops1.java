public class oooops1{
    public static void main(String args[]){
      Pen p1=new Pen(); //pen object p1
      p1.setColor("blue");
      System.out.println(p1.color);
      p1.setTip(5);
      System.out.println(p1.tip);
      p1.setColor("blue");
      System.out.println(p1.color);

      BankAccount myAcc=new BankAccount();
      myAcc.username="vnbl";
      myAcc.setPassword("123");
      System.out.println(myAcc.username);
    //   System.out.println(myAcc.password);
    
    }
}

class BankAccount{
    public String username;
    private String passsward;
    public void setPassword(String ps){
        passsward=ps;
    }

}

class Pen{
    String color;
    int tip;
    public void setColor(String color){
      this.color=c
    }
    public String geString(){
        return this.
    }

}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy,int chem,int math){
        percentage=(phy+chem+math)/3;
    }
}