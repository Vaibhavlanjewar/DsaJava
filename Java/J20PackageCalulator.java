//package 
import InheritancePackage.*;
public class J20PackageCalulator {
    public static void main(String args[]){
        VeryAdvCal obj2=new VeryAdvCal();
         int add=obj2.add(10,5);
        int sub=obj2.sub(10,5);
        int mul=obj2.mul(10,5);
        int div=obj2.div(10,5);
        double pow=obj2.power(2,3);

        System.out.println(add+" "+sub+" "+mul +" "+ div+ " "+pow);
    }
}
