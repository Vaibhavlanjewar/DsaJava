public class J28WrapperClass {
    public static void main(String[] args) {
        // wrapper class 
        int num=7;
        Integer num1=num; // autoBoxing
        // primitive to Class 
        System.out.println(num1); //7

        int num2=num1.intValue(); //auto unboxing 
        System.out.println(num2); //7
       
        String str="12";
        int num3=Integer.parseInt(str);
        System.out.println(num3*2); //24
    }
}
