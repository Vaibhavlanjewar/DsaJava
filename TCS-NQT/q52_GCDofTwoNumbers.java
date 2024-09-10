public class q52_GCDofTwoNumbers {
    public static void main(String args[]){
      int a=55;
      int b=11;
      System.out.println(gcd(a,b));
    
    }

    public static int gcd(int a,int b){
     if(b==0) return a;
     return gcd(b,a%b);
     }
}
