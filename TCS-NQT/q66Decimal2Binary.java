public class q66Decimal2Binary {
    public static void main(String args[]){
        int N=7;
		int res=0;
		int fact=1;
		while(N>0){
		  res+=N%2*fact;
		  fact*=10;
		    N/=2;
		}
	    
	    System.out.println(res);
    }
}
