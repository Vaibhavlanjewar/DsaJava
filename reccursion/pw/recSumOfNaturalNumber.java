public class recSumOfNaturalNumber{
  public static void funcPa(int i,int sum){
    if(i<1){
        System.out.println(sum);
        return ;    
    }
    funcPa(i-1,sum+i);
  }

  public static int func(int n){
    if(n==0)return 0;
    return n+func(n-1);  // breaking the problem into smaller subproblems and calling the same function to solve those subproblems
  }
  public static void main(String args[]){
    int n=3;
    // funcPa(n,0);
    System.out.println(func(n));
  }
}