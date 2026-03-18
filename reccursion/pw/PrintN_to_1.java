public class PrintN_to_1{
    public static void fun(int i,int n){
        if(i<1){
            return ;
        }
        System.out.println(i);
        fun(i-1,n);
    }
    public static void func1(int i,int n){
        if(i>n)return ;
        func1(i+1,n);
        System.out.println(i);
    }
    public static void main(String[]args){
          int n=5;
        //   func1(1,n);
            fun(n,n);
    }
}