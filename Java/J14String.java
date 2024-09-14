public class J14String {
    public static void main(String args[]){
        // String name=new String("navin");
        String name="navin"; 
        // object created in the heap as "navin"
        
        //new object created wit diff add , navin java  , and previously created i.e navin is removed by java garbage collector 
        name=name+" Java";
       System.out.println(name);
        String s1="Navin";
        String s2="Navin";
        System.out.println(s1==s2); //has same object 



    }
}
