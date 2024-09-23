class A extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("Thread1 :"+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("Thread2 :"+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }
    }
}
public class J49Treads {
    public static void main(String args[]){
        A obj1=new A();
        B obj2=new B();

        obj1.start();
        try{
            Thread.sleep(2);
        }
        catch(InterruptedException e){e.printStackTrace();}
        obj2.start();
    }
}
