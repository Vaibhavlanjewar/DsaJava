public interface factorial{
    public int fact(int n);
}
 class factImplementation implements factorial{
    public int fact(int n){
        if(n==0)return 1;
        return n*fact(n-1);
    }
    public static void main(String args[]){
        int n=5;
        factImplementation fct=new factImplementation();
        System.out.println(fct.fact(n));
    }
}

// run
// javac factorial.java
// java factImplementation